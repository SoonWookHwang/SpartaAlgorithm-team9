import java.util.*;

class Solution {//프로그래머스 모의고사
    public int[] solution(int[] answers) {
        


        int[][] stu_list = new int[3][]; //학생별 반복되는 수배열을 stu_list에 넣어준다

        stu_list[0] = new int[] {1, 2, 3, 4, 5};
        stu_list[1] = new int[] {2, 1, 2, 3, 2, 4, 2, 5};
        stu_list[2] = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        //stu_list = [[1,2,3,4,5] [2,1,2,3,2,4,2,5] [3,3,1,1,2,2,4,4,5,5]]

        int[] score = new int[] {0, 0, 0};  //3명의 학생의 score를 배열로 저장

        for (int j = 0; j < stu_list.length; j++) {
            //j번째학생의 답과 answers[i]를 비교해 같으면score++ 
            //j번째 학생 : stu_list[0] = [1,2,3,4,5]   j번째학생의 i번째답 : stu_list[0][i]
            for (int i =0; i < answers.length; i++) {
                if (answers[i] == stu_list[j][i % stu_list[j].length]) {  // 0 1 2 3 4 
                    score[j]++;
                }
            }
        }
        // score = [1 2 3]
        int max = Math.max(Math.max(score[0], score[1]), score[2]); //최고점 찾기
        int idx = 0;

        for (int i = 0; i < score.length; i++) { //최고점과 같은 점수인 사람 수 찾기
            if (score[i] == max) {
                idx ++;
            }
        }

        int[] answer = new int[idx];
        int cnt = 0;

        for (int i = 0; i < score.length; i++) { //최고점과 같은 학생(i+1)을 answer에 추가
            if (score[i] == max) { //score = [1 2 3]
                answer[cnt] = i + 1;
                cnt++;
            }
        } //answer = [3]
        

        
        return answer;
    }
}