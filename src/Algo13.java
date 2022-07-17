import java.util.Arrays;

public class Algo13 {
    public static int solution(int n) {
        int answer = 0;
        //10진법 정수 n 을 3진법으로 변환하는 코드
        String three = Integer.toString(n,3);
        System.out.println(three);
        //문자열을 거꾸로 바꾸는 코드
        StringBuffer newThree = new StringBuffer(three);
        String reverse = newThree.reverse().toString();

        System.out.println(reverse);
        //3진법을 10진법으로 바꾸는 코드
        answer=Integer.parseInt(reverse,3);
        System.out.println(answer);

        return answer;
    }
}
