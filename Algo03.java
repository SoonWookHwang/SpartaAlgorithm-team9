public class Algo03 {
    public String solution(int n) {
        String answer = "";
        char[] subak = {'수', '박'};
        for(int i = 0; i < n; i++){
            answer += subak[i%2];
        }
        return answer;
    }
}
