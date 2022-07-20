import java.util.*;

public class Algo29 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        int cnt = 0;
        List<Integer> answer1 = new ArrayList<Integer>();

        for(int count=0; count< commands.length; count++){
            int i = commands[count][0];
            int j = commands[count][1];
            int k = commands[count][2];
//            System.out.println("i="+i);
//            System.out.println("j="+j);
//            System.out.println("k="+k);

            int[] cutArr = new int[j-i+1];   //{1,5,2,6,3,7,4}
                 for(int cut = 0; cut < cutArr.length; cut++){
                    cutArr[cut] = array[cut+i-1];
            }
//            System.out.println(Arrays.toString(cutArr)); //잘라진 배열
            Arrays.sort(cutArr);   //오름차순 정렬

//            System.out.println(cutArr[k-1]);   //

            answer1.add(cutArr[k-1]);
            cnt++;
        }
        System.out.println(answer1);
        answer = new int[cnt];
        for(int l=0; l<answer.length; l++){
            answer[l] = answer1.get(l);
        }
//        System.out.println(Arrays.toString(answer));


        return answer;
    }
}