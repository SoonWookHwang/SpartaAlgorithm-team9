import java.util.*;

public class Algo17 {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int count = 0;//로또에서 지워진 숫자의 갯수
        int win = 0; // 지워진 숫자를 제외한 번호들중 당첨번호와 일치하는 갯수
        int matchNum = win+count;

//        가능한 가장 높은 등수== count가 win_nums에 다 일치하는 경우 ->  win+count  = 6일때 1등
//        가능한 가장 낮은 등수 == count가 win_nums에 다 불일치하는 경우 ->  count   = 2일때 5등
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                count++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    win++;
                }
            }
        }
        int best = 0; // 제일 높은 등수

        if(matchNum==6){
            best = 1;
        }if(matchNum==5){
            best = 2;
        }if(matchNum==4){
            best = 3;
        }if(matchNum==3){
            best = 4;
        }if(matchNum==2){
            best = 5;
        }
        int[] answer = {best,count};
        return answer;
    }
}


