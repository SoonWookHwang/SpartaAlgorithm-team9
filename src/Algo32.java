public class Algo32 {
    public static int[] solution(int N, int[] users) {
        int[] answer = new int[N];
        // 스테이지 별 유저수
        int[] userPerStages = new int[N];
        // 스테이지별 실패율
        float[] failRates = new float[N];

        // 각 스테이지에 몇 명의 유저가 머물고 있는지 계산
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < users.length; j++) {
                if (users[j] == i + 1)
                    ++userPerStages[i];
            }
        }

        // 현재 스테이지에 머물고 있는 유저수(userInStage)를
        // 해당 스테이지에 도달했거나 통과한 유저수(userPassed)로 나눠서 실패율을 측정

        // 1스테이지의 userPassed는 모든 유저수와 같다.
        int userPassed = users.length;
        for (int i = 0; i < N; i++) {
            int userInStage = userPerStages[i];
            if (userPassed == 0) {
                failRates[i] = 0;
            } else {
                // 실패율을 계산하고
                failRates[i] = (float) userInStage / userPassed;
            }
            // 해당 스테이지에 남아있는 유저수는 통과한 유저수에서 빼준다.
            userPassed -= userInStage;
        }

        // 가장 높은 실패율
        float highestFailRate = 0f;
        // 실패율이 가장 높은 스테이지
        int stageNumber = 1;

        for (int i = 0; i < failRates.length; ++i) {
            highestFailRate = failRates[0];
            stageNumber = 1;
            // 스테이지별 실패율 배열을 순회하면서, 가장 높은 실패율을 찾은 뒤
            for (int j = 0; j < failRates.length; ++j) {
                if (failRates[j] > highestFailRate) {
                    highestFailRate = failRates[j];
                    stageNumber = j + 1;
                }
            }
            // 찾은 값에 -1을 넣어주고
            failRates[stageNumber - 1] = -1;
            // 해당 스테이지를 정답 배열에 넣는다
            answer[i] = stageNumber;
        }

        return answer;
    }
}
