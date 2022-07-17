package src;

import java.util.Arrays;
import java.util.Comparator;

public class Algo19 {
    public String[] solution(String[] strings, int n) {
        // 2. n번째 문자가 같다면 사전순으로 정렬
        // 그래서 미리 정리해놓고 그것을 다시 정렬하면 해당 조건이 해결됨
        Arrays.sort(strings);

        // 1. n번째 문자를 기준으로 정렬해야함
        // Comparator -> 정렬 기준을 정해주는 클래스!
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // n번째 문자를 기준으로 정렬!
                if(s1.charAt(n) > s2.charAt(n)) return 1;
                else if(s1.charAt(n) == s2.charAt(n)){
                    return 0;
                }
                else return -1;
            }
        });
        return strings;
    }
}
