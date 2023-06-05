package Lv2;

public class _2xn타일링 {
    public static int solution(int n) {
        if (n <= 2)
            return n;
        int[] d = new int[n + 1];
        d[1] = 1;
        d[2] = 2;

        for (int i = 3; i <= n; i++) {
            d[i] = (d[i - 1] + d[i - 2]) % 1000000007;
        }

        return d[n] % 1000000007;
    }

    public static void main(String[] args) {
        int n = 4;

        System.out.println(solution(n));
    }
}
