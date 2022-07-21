import java.util.ArrayList;

class Algo38 {//프로그래머스 크레인 인형뽑기 게임  stack

    public static int solution(int[][] board, int[] moves) {
        ArrayList<Integer> aList = new ArrayList<Integer>();
        // [[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[0,2,4,4,2],[3,5,1,3,1]]
        // [1,5,3,5,1,2,1,4]
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    aList.add(board[j][moves[i] - 1]);
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < aList.size() - 1; i++) {//aList = 4 2
            if (aList.get(i) == aList.get(i + 1)) {
                aList.remove(i);
                aList.remove(i);
                answer += 2;
                i = -1;
            }
        }

        return answer;
    }
} 