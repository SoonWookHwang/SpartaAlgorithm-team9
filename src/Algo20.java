import java.util.Arrays;

public class Algo20 {
    public static String solution(String s) {
        var chars = s.toCharArray();
        Arrays.sort(chars);

        StringBuilder sb = new StringBuilder(new String(chars));
        return sb.reverse().toString();
    }
}
