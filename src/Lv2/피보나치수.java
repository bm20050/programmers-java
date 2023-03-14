package Lv2;

public class 피보나치수 {
    public static int solution(int n) {
        int answer = 0;
        long[] temp = new long[100001];
        temp[0] = 0;
        temp[1] = 1;

        for (int i = 2; i <= n; i++) {
            temp[i] = (temp[i - 1] + temp[i - 2]) % 1234567;
        }
        answer = (int)temp[n];
        return answer;
    }

    public static void main(String[] args) {
        int n = 3;

        System.out.println(solution(n));
    }
}
