import java.util.Arrays;
import java.util.Comparator;

public class Algo08 {
    public static long solution(long n) {
        long answer;

        String s = Long.toString(n);
        String[] sarr = s.split("");

        Arrays.sort(sarr, Comparator.reverseOrder());
        answer = Long.parseLong(String.join("", sarr));

        return answer;
    }
}
