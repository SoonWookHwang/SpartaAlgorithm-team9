package src;

public class Algo23 {
    public String solution(String s, int n) {
        String answer = "";
        // 각 문자별로 밀어야되는지 아닌지 판단해야하므로 char 배열로
        char[] chs = s.toCharArray();

        // 문자 배열 순회
        for(char c : chs){
            // "아스키코드"
            int tmp_c = (int)c;

            // 아스키코드 65~90은 대문자
            if(tmp_c >= 65 && tmp_c <= 90){
                //만약 대문자고 n만큼 밀어냈는데 그 값이 90 이상(대문자가 아닌값)이면 -26(알파벳 개수)을 해줘서 다시 처음으로 댕겨줌
                if(tmp_c + n > 90) tmp_c = (tmp_c + n) - 26;
                // 그대로 대문자 범위 안이면 그대로 남김
                else tmp_c += n;
            // 소문자
            }else if(tmp_c >= 97 && tmp_c <= 122){
                if(tmp_c + n > 122) tmp_c = (tmp_c + n) -26;
                else tmp_c += n;
            }

            // 문자열에 그대로 저장
            answer += (char)tmp_c;
        }
        return answer;
    }
}
