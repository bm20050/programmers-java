package Lv2;

public class 예상대진표 {
    public static int solution(int n, int a, int b) {
        int answer = 0;

        while (true) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;

            if (a == b)
                break;
            answer ++;
        }

        return answer + 1;
    }

    public static void main(String[] args) {
        int n = 8;
        int a = 4;
        int b = 5;

        System.out.println(solution(n, a, b));
    }
}
