class Solution {//프로그래머스 나머지가 1이 되는 수
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i < n; i++) {//10   3 9
            if (n % i == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}