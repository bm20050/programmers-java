package Lv2;

public class 숫자의표현 {
    public static int solution(int n) {
        int i = 1, x = n;

        while (i < x) {
            x = n / i++;
        }
        return i - 1;
    }

    public static void main(String[] args) {
        int n = 15;

        System.out.println(solution(n));
    }
}
