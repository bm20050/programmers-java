package Lv2;

public class 숫자의표현 {
    public static int solution(int n) {
        int count = 1;
        for (int i = 1; i < n; i++) {
            int m = i;
            int x = i;
            while (true) {
                if (x == n) {
                    count += 1;
                    break;
                }
                else if (x > n) {
                    break;
                }
                m += 1;
                x += m;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 15;

        System.out.println(solution(n));
    }
}
