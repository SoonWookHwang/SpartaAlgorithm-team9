package src;

public class Algo35 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        // n만큼의 문자열 배열
        String[] answer = new String[n];
        for(int i = 0; i < n; i++){
            // 둘다 이진수로 변환
            String s1 = intToBinaryString(n, arr1[i]);
            String s2 = intToBinaryString(n, arr2[i]);
            // 출력을 위한 빈 문자열
            String cur = "";
            for(int j = 0; j < n; j++){
                // 개별 문자열을 순회하면서 둘다 0이면 공백, 이외는 #으로 빈 문자열에 추가
                if(s1.charAt(j) == '0' && s2.charAt(j) == '0'){
                    cur += ' ';
                }else{
                    cur += '#';
                }
            }
            answer[i] = cur;
        }
        return answer;
    }
    // n길이 만큼의 2진법 문자열 반환큐
    String intToBinaryString(int n, int a){
        String s = Integer.toString(a, 2);
        String zero = "";
        // 만약 n = 5, "1110"(2)라는 이진수가 있으면 문제에서는 "01110"(2)으로 봐야하므로
        // 5 - 4, 1번만 앞에 0을 추가면 된다. 그래서 n - s.length()
        for(int i = 0; i < n - s.length(); i++){
            zero += '0';
        }
        return zero+s;
    }
}
