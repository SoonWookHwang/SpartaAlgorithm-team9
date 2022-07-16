import java.util.Arrays;
import java.util.Random;

public class Algo21 {
    public static int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = 1; j <= nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    boolean t = true;
                    for (int a = 2; a < sum; a++) {
                        if (sum % a == 0) {
                            t = false;
                            continue;
                        }
                    }
                    if (t) answer++;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}
//
//
//        //소수인지 판단하는 식
//        int count = 0;
//        for (int i = 1; i <= num; i++) {
//            if (num % i == 0)
//                count += 1;
//            if (count >= 3)
//                return count;
//        }
//
//