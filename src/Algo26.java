class Solution {//프로그래머스 약수의 합
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++) {//12   1 2 3 4 6 12
            if (n % i == 0) {
                answer += i;
            }
        }


        return answer;
    }
}