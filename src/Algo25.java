public class Algo25 {
    public static int solution(int left, int right) {  //13,17
        int answer = 0;      // 결과값

        for(int i=left; i<=right; i++){  // 최소값 left 에서부터 최대값 right 까지
            if(divisorCount(i)%2==0) {
                answer += i;  // 약수의 개수가 짝수일때 해당수를 더해준다.

            }if(divisorCount(i)%2!=0) {
                answer -= i; // 약수의 개수가 홀수일때 해당수를 빼준다.

            }
        }
        return answer;
    }
    public static int divisorCount(int num) {
        int count = 0;
        int i = 1;
        while (i <= num) {
            if (num % i == 0)
                count += 1;
            i++;
        }
        return count;
    }

}
