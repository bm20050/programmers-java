package Lv2;

import java.util.Arrays;

public class 최솟값만들기 {
    public static int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        int j = B.length - 1;
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[j--];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};

        System.out.println(solution(A, B));
    }
}
