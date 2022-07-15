public class Algo03 {
    public String solution(int n) {
        String answer = "";
        // 수박 글자 출력을 위한 char 배열
        char[] subak = {'수', '박'};
        for(int i = 0; i < n; i++){
            // 주어진 n을 순회하여 i 값이 짝수면 '수', 홀수면 '박'
            answer += subak[i%2];
        }
        return answer;
    }
}
