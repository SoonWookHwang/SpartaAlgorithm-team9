import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);
        String[] str = num.split("");

        for (int i = 0; i < str.length; i++){
            int plus = Integer.parseInt(str[i]);
            answer += plus;  
        }
        return answer;
    }
}