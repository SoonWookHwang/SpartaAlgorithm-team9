import java.util.HashMap;

public class Algo04 {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        var counter = new HashMap<String, Integer>();

        for (String s : participant) {
            if (!counter.containsKey(s))
                counter.put(s, 1);
            else
                counter.put(s, counter.get(s) + 1);
        }
        for (String s : completion) {
            if (!counter.containsKey(s))
                counter.put(s, 1);
            else
                counter.put(s, counter.get(s) - 1);
        }

        for (var s : counter.keySet()) {
            if (counter.get(s) > 0) {
                answer = s;
            }
        }

        return answer;
    }
}
