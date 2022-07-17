package src;

import java.util.Arrays;

public class Algo27 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        // 최대 많은 부서를 지원해야되니까 제일 예산을 많이 잡아 먹는거부터 쳐냄
        Arrays.sort(d);

        // 그래서 길이를 이용해서(다른 언어는 스택을 사용할 수 있음)
        int len = d.length;

        // Arrays.stream(정수 배열).sum() -> 배열의 합
        // Arrays.copyOfRange(정수 배열, 시작 인덱스, 끝 인덱스) -> 배열을 시작인덱스부터 "끝 인덱스 전"까지 복사
        //  --> [0, 1, 2, 3, 4, 5, 6] 만약 copyOfRange(arr, 0, 4) -> [0, 1, 2, 3]으로 출력
        while(Arrays.stream(Arrays.copyOfRange(d, 0, len)).sum() > budget){
            // 배열을 더한값이 예산보다 많으면 예산 많이 잡아먹는 부서부터 쳐냄
            len--;
        }

        System.out.println(len);
        return len;
    }
}
