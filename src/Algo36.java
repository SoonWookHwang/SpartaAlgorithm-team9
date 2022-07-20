public class Algo36 {
    public static String solution1(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        // 마지막으로 누른 숫자
        // 초기값 * #을 10, 12로 놓고 계산한다
        int left = 10;
        int right = 12;

        for (int i = 0; i < numbers.length; i++) {
            int next = numbers[i];
            // 눌러야 할 숫자가 0이면 11로 계산한다
            if (next == 0)
                next = 11;

            // 3으로 나누어 떨어지는 수는 오른쪽, 나머지가 1이면 왼쪽이다
            if (next % 3 == 0) {
                right = next;
                answer.append("R");
                continue;
            } else if (next % 3 == 1) {
                left = next;
                answer.append("L");
                continue;
            }

            // 나머지가 2인 경우: 2,5,8,0
            // 거리를 구하는 공식
            int leftDistance = Math.abs(next - left);
            int rightDistance = Math.abs(next - right);
            leftDistance = leftDistance / 3 + leftDistance % 3;
            rightDistance = rightDistance / 3 + rightDistance % 3;

            // 거리 비교
            if (leftDistance > rightDistance) {
                right = next;
                answer.append("R");
            } else if (rightDistance > leftDistance) {
                left = next;
                answer.append("L");
            } else {
                // 같으면 hand값으로 판별
                if (hand.equals("right")) {
                    right = next;
                    answer.append("R");
                } else {
                    left = next;
                    answer.append("L");
                }
            }
        }

        return answer.toString();
    }

    public static String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        // 숫자 버튼 별 좌표를 설정해둔다
        int[][] coordinates = {
                {1, 3}, //0
                {0, 0}, //1
                {1, 0}, //2
                {2, 0}, //3
                {0, 1}, //4
                {1, 1}, //5
                {2, 1}, //6
                {0, 2}, //7
                {1, 2}, //8
                {2, 2}, //9
        };

        // 현재 손가락의 위치를 저장할 값
        // 처음 왼손과 오른손이 놓인 좌표
        int[] left = {0, 3};
        int[] right = {2, 3};

        for (int i = 0; i < numbers.length; i++) {
            // 눌러야 할 숫자
            int next = numbers[i];

            // 눌러야 할 숫자가 왼쪽, 오른쪽일 경우
            switch (next) {
                case 1, 4, 7 -> {
                    left = coordinates[next];
                    answer.append("L");
                    continue;
                }
                case 3, 6, 9 -> {
                    right = coordinates[next];
                    answer.append("R");
                    continue;
                }
            }

            // 가운데(2,5,8,0)일 경우
            // 좌표간의 거리 계산을 한다
            int leftDistance = CalcDistance(coordinates[next], left);
            int rightDistance = CalcDistance(coordinates[next], right);

            // 거리 비교
            if (leftDistance > rightDistance) {
                right = coordinates[next];
                answer.append("R");
            } else if (leftDistance < rightDistance) {
                left = coordinates[next];
                answer.append("L");
            } else {
                // 같으면 hand값으로 판별
                if (hand.equals("right")) {
                    right = coordinates[next];
                    answer.append("R");
                } else {
                    left = coordinates[next];
                    answer.append("L");
                }
            }
        }
        return answer.toString();
    }

    public static int CalcDistance(int[] next, int[] hand) {
        return Math.abs(next[0] - hand[0]) + Math.abs(next[1] - hand[1]);
    }
}
