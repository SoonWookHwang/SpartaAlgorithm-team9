import java.util.TreeSet;

public class Algo16 {
    public static int[] solution(int[] numbers) {
        TreeSet<Integer> arr = new TreeSet<>();

        for (int i = 0; i < numbers.length; ++i) {
            for (int j = i + 1; j < numbers.length; ++j) {
                arr.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = arr.stream().mapToInt(Integer::intValue).toArray();
        for (int i : answer) {
            System.out.println(i);
        }

        return answer;
    }
}
