package src;

public class Algo11 {
    public int solution(int num) {
        int answer = 0;
        long n = (long)num;
        while(n != 1){
            if(answer == 501){
                return -1;
            }
            if(n % 2 == 0){
                n /= 2;
            }else{
                n = (n * 3) + 1;
            }
            answer++;
        }
        return answer;
    }
}
