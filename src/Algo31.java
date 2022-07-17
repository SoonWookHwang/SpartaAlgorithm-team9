package src;

public class Algo31 {
    static boolean[] prime = new boolean[1000001];
    public int solution(int n) {
        int answer = 0;
        // 소수가 아니라면 true;-> 왜??? 자바에서 boolean의 배열은 false로 초기화되니까!
        prime[0] = prime[1] = true;
        setPrime(n);
        for(int i=1; i<=n;i++){
            if(!prime[i]) answer++;
        }
        return answer;
    }

    // 에라토스테네스의 체! -> 설명 듣는거 보다 한번 검색해서 읽어보는게 효과적(gif로 보여주는거)
    void setPrime(int n){
        for(int i = 2; i*i<=n;i++){
            if(!prime[i]){
                for(int j = i*i; j <= n; j+=i) prime[j] = true;
            }
        }

    }
}
