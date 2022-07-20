import java.util.*;

class Solution {//프로그래머스 최소 직사각형
    public int solution(int[][] sizes) {

        //각 직사각형을 [큰값 작은값]형태로 나타내고
        
        //큰 값들 중 가장 큰 값을 max_x
        //작은 값들 중 가장 큰 값을 max_y로 두고 넓이를 구한다.

        int max_x = 0;
        int max_y = 0;

        for (int i = 0; i < sizes.length; i++) {
            int x = Math.max(sizes[i][0],sizes[i][1]);
            int y = Math.min(sizes[i][0],sizes[i][1]);

            max_x = Math.max(max_x, x);
            max_y = Math.max(max_y, y);
        }

        int answer = max_x * max_y;

        return answer;

    }
}