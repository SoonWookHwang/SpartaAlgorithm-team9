public class Algo09 {
    public static long solution(long n) {
        long answer = 0;
        double d = Double.valueOf(n);    // Math.sqrt();를 사용하기위해 n의 값을 double로 형변환
        double result = Math.sqrt(d);     //n의 제곱근을 result로 저장
        if(result== Math.floor(result)){
            //result가 정수인지 판별 true면 n은 제곱근이 있는 수
            answer = (long)((result+1)*(result+1));
        }else{
            answer = -1;
        }
        System.out.println(answer);
        return answer;
    }
}

