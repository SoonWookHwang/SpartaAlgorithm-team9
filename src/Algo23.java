package src;

public class Algo23 {
    public String solution(String s, int n) {
        String answer = "";

        char[] chs = s.toCharArray();

        for(char c : chs){
            int tmp_c = (int)c;
            if(tmp_c >= 65 && tmp_c <= 90){
                if(tmp_c + n > 90) tmp_c = (tmp_c + n) - 26;
                else tmp_c += n;
            }else if(tmp_c >= 97 && tmp_c <= 122){
                if(tmp_c + n > 122) tmp_c = (tmp_c + n) -26;
                else tmp_c += n;
            }
            answer += (char)tmp_c;
        }
        return answer;
    }
}
