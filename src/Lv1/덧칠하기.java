package Lv1;

public class 덧칠하기 {
    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        int x = 0;
        for (int i = 0; i < section.length; i++) {
            if (section[i] > x) {
                answer++;
                x = section[i] + m - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};

        System.out.println(solution(n, m , section));
    }
}
