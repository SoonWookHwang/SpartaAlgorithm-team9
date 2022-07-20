import java.util.Arrays;

public class Algo33 {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌 체육복을 가져온 학생이 도난당한 경우
        for(int i=0; i<lost.length; i++){                          //n = 5 , lost ={2,4}, reserve = {1,3,5}  -> {-1,-1,5}
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;

                    break;
                }
            }
        }
        // 도난당한 학생에게 체육복 빌려주는 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){
                    answer++;
                    System.out.println(reserve[j]);
                    reserve[j] = -1;

                    break;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}






//
//    int answer = 0;
//    int count = 0;
////n = 5 , lost ={2,4}, reserve = {1,3,5}
//
//        for(int i=1; i<=n; i++){                  // n[] = {1,2,3,4,5}
//                for(int j=0; j< lost.length; j++) {       //lost[] = {2,4}
//        if (i == lost[j]+1|| i==lost[j]-1) {    //lost[0] =2   i==1= 2-1, lost[j]
//        count++;
//        }
//        }
//        System.out.println(count);
//        }