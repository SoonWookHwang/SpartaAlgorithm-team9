package src;

public class Algo07 {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        char[] chs = str.toCharArray();
        int[] answer = new int[str.length()];
        for(int i = 0; i < str.length(); i++){
            answer[i] = chs[str.length() - 1 - i] - '0';
        }
        return answer;
    }
}
