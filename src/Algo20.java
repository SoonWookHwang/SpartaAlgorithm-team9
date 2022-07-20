import java.util.Arrays;

public class Algo20 {
    public static String solution(String s) {
        // 받은 문자열을 배열로 변환
        var chars = s.toCharArray();
        
        // 오름차순 정렬
        Arrays.sort(chars);

        // 정렬된 배열을 StringBuilder에 전달
        StringBuilder sb = new StringBuilder(new String(chars));

        // 역순으로 뒤집고 반환
        return sb.reverse().toString();
    }
}
