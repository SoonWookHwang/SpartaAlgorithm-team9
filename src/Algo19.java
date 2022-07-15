package src;

import java.util.Arrays;
import java.util.Comparator;

public class Algo19 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
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
