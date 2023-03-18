package Lv2;

public class 멀리뛰기 {
    public static long solution(int n) {
        int[] x = new int[n + 1];

        x[0] = 1;
        x[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            x[i] = (x[i - 1] + x[i - 2]) % 1234567;
        }
        return x[n];
    }

    public static void main(String[] args) {
        int n = 4;

        System.out.println(solution(n));
    }
}
