public abstract class Transport {
    protected int id = 0;
    public int gasAmount = 100;
    public int speed = 0;
    public int currentPassengers = 0;
    private final int maxPassengers;

    public enum State {
        running("운행 중"),
        parking("차고지행"),
        normal("일반"),
        unable("운행불가");

        public final String stateName;

        State(String s) {
            this.stateName = s;
        }

        public void printState() {
            System.out.printf("상태 = %s\n", stateName);
        }
    }

    public State state = State.running;

    public Transport(int maxPassengers, int id) {
        this.id = id;
        this.maxPassengers = maxPassengers;
    }

    public void ChangeSpeed(int acceleration) {
        speed += acceleration;
        if (speed <= 0) {
            speed = 0;
        }
    }

    public void ChangeState(State newState) {
        state = newState;
        state.printState();
        if (state.stateName.equals("차고지행")) {
            currentPassengers = 0;
        }
    }

    public void ChangeGas(int amount) {
        gasAmount += amount;
        if (gasAmount <= 0) {
            gasAmount = 0;
        }

        System.out.printf("주유량 = %d\n", gasAmount);
    }

    public boolean AddPassengers(int newPassengers) {
        if (currentPassengers + newPassengers > maxPassengers) {
            System.out.println("최대 승객 수 초과!");
            return false;
        }
        currentPassengers += newPassengers;
        System.out.printf("탑승 승객 수 = %d\n", newPassengers);
        System.out.printf("잔여 승객 수 = %d\n", maxPassengers - currentPassengers);

        return true;
    }
}

class Bus extends Transport {
    private static int busCount = 0;
    public Bus() {
        super(30, ++busCount);
        System.out.printf("이 버스의 번호는 %d 입니다.\n", id);
    }

    @Override
    public boolean AddPassengers(int newPassengers) {
        if (super.AddPassengers(newPassengers)) {
            if (newPassengers > 0) {
                var newFare = newPassengers * 1000;
                System.out.printf("요금 확인 = %d\n", newFare);
            }
            return true;
        }
        return false;
    }

    @Override
    public void ChangeGas(int amount) {
        super.ChangeGas(amount);

        if (gasAmount < 10) {
            ChangeState(State.parking);
            System.out.println("주유 필요!");
        }
    }
}

class Taxi extends Transport {
    private static int taxiCount = 0;
    private int minimumFare = 3000;
    private int farePerDistance = 1000;
    private int minimumDistance = 1;
    private int accumulatedFare = 0;
    private String destination = "";
    public Taxi() {
        super(4, ++taxiCount);
        System.out.printf("이 택시의 번호는 %d 입니다.\n", id);
        System.out.printf("주유량 = %d\n", gasAmount);
//        System.out.printf("상태 = %s\n", state.stateName);
        ChangeState(State.normal);
    }

    public boolean AddPassengers(final int newPassengers,
                                 final String destination, final int distance) {
        if (state.stateName != "일반") {
            System.out.println("탑승 불가!");
            return false;
        }

        if (super.AddPassengers(newPassengers)) {
            System.out.printf("기본요금 확인 = %d\n", minimumFare);
            this.destination = destination;
            System.out.printf("목적지 = %s\n", this.destination);
            System.out.printf("목적지까지의 거리 = %dkm\n", distance);

            int newFare = minimumFare + (farePerDistance) * distance;
            System.out.printf("지불할 요금 = %d\n", newFare);
            accumulatedFare += newFare;

            ChangeState(State.running);
            return true;
        }

        return false;
    }

    @Override
    public void ChangeGas(int amount) {
        super.ChangeGas(amount);

        if (gasAmount < 10) {
            ChangeState(State.unable);
            System.out.println("주유 필요!");
        }

        currentPassengers = 0;
        ChangeState(State.normal);

        System.out.printf("누적 요금 = %d\n", accumulatedFare);
    }
}
