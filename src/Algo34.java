import java.util.*;

class Solution { //프로그래머스 포켓몬
    public int solution(int[] nums) {
        int answer = 0;
        //nums/2 > 포켓몬 종류 : 포켓몬 종류
        //       <             : numms /2
        ArrayList<Integer> arr = new ArrayList<Integer>(); //arr = 중복제거된 arraylist

        int x = 0;
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != x) {
                arr.add(nums[i]);
                x = nums[i];

            }
        }
        //중복이 제거된 arraylist

        if (nums.length / 2 < arr.size()) { //arr.size():포켓몬 종류의 수
            answer = nums.length / 2;
        } else {
            answer = arr.size();
        }
        return answer;
    }
}