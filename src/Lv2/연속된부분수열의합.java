package Lv2;

import java.util.Arrays;

public class 연속된부분수열의합 {
    public static int[] solution(int[] sequence, int k) {
        int x = 10000000, y = 0;
        int sum = 0;
        int i = 0, j = 0;
        int[] answer = new int[2];
        while (i < sequence.length || j < sequence.length) {
            if (sum < k) {
                if (i < sequence.length)
                    sum += sequence[i++];
                else
                    break;
            } else if (sum > k) {
                sum -= sequence[j++];
            } else {
                if (x - y > i - j) {
                    x = i;
                    y = j;
                    answer[0] = y;
                    answer[1] = x - 1;
                }
                sum -= sequence[j++];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] sequence = {1, 2, 3, 4, 5};
        int k = 7;

        System.out.println(Arrays.toString(solution(sequence, k)));
    }
}
