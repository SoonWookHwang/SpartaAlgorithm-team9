public class Algo28 {
    public static int[] solution(int n, int m) {
        // 최대공약수
        int a = gcd(n, m);
        // 최소 공배수
        int b = n * m / a;

        return new int[]{a, b};
    }

    // 유클리드 호제법을 사용해서 최대공약수를 구하는 방법
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }
}
