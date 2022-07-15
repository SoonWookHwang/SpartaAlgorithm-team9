package src;

import java.util.ArrayList;

public class Algo15 {
    public int[] solution(int []arr) {
        int cur = arr[0];
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 1; i < arr.length; i++){
            if(cur == arr[i]) continue;

            al.add(cur);
            cur = arr[i];

        }
        al.add(cur);
        int[] answer = new int[al.size()];
        for(int i = 0; i < al.size(); i++){
            answer[i] = al.get(i);
        }

        return answer;
    }
}
