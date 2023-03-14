package Lv2;

public class 다음큰숫자 {
    public static int solution(int n) {
        int x = Integer.bitCount(n);

        while (true) {
            n++;
            if (x == Integer.bitCount(n))
                break;
        }
        return n;
    }

    public static void main(String[] args) {
        int n = 78;

        System.out.println(solution(n));
    }
}
