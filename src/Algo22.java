import java.util.*;

class Solution {//프로그래머스 숫자 문자열과 영단어
    public int solution(String s) {
        String[] eng = new String[] {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] num = new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        for (int i = 0; i < 10; i++) {
            s = s.replace(eng[i], num[i]);  //s.replace(str1, str2)
        }

        int answer = Integer.parseInt(s);
        return answer;
    }
}