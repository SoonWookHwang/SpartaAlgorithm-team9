public class Algo01 {
    public static String solution(int a, int b) {
        //요일의 String 배열
        String[] dayOfWeek = {"mon", "sun", "tue", "wed", "thu", "fri", "sat"};
        //count = 1월 1일부터 해당 날짜까지의 일수
        //result = (count%7)+5 = 일수를 7로 나눈 나머지 값에 5배열을 더하여 해당날짜의 요일을 구함
        //result가 dayOfWeek의 배열길이를 넘어갈때 -7을 하여 해당 배열이 나오게함
        //Answer = dayOfweek[result] = 해당요일

        int count = 0;
//        for (int count = 0; count <= dayOfWeek.length; count++) {
        // a(해당 월)이전의 월들의 일수를 합한뒤 b를 더함
        for (int month = 1; month <= a; month++) {
            //2월의 일수 29일을 더하는 식
            if (month == 2) {
                for (int day = 1; day <= 29; day++) {
                    count++;
                    if (a == month && b == day) {
                        break;
                    }
                }
                //31일인 월의 일수를 더하는것
            } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                for (int day = 1; day <= 31; day++) {
                    count++;
                    if (a == month && b == day) {
                        break;
                    }
                }
                //30일인 월의 일수를 더하는것
            } else {
                for (int day = 1; day <= 30; day++) {
                    count++;
                    if (a == month && b == day) {
                        break;
                    }
                }
            }
        }
        int result = ((count - 1) % 7) + 5;
        if (result >= 7) {
            result = result - 6;
        }
        System.out.println("해당날짜까지 지나간 일수는" + (count - 1));
        System.out.println("result값은" + result);
        System.out.println(dayOfWeek[result]);

//        1월~12월까지 각 월의 일수
//
//        a = 월 , b 는 일
//          1<=a<=12    1<=b<=29 or 30 or 31
        String answer = "";
        return answer;
    }
}
