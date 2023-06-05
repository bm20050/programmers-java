package Lv2;

import java.util.Arrays;

public class _2개이하로다른비트 {
    public static long toLong(String s) {
        long j = 1L;
        long result = 0L;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1')
                result += j;
            j *= 2;
        }
        return result;
    }

    public static long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 4 != 3) {
                answer[i] = numbers[i] + 1;
            } else {
                String s = Long.toBinaryString(numbers[i]);
                if (!s.contains("0")) {
                    s = "10" + s.substring(1);
                } else {
                    int x = s.lastIndexOf("0");
                    s = s.substring(0, x) + "10" + s.substring(x + 2);
                }
                answer[i] = toLong(s);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        long[] numbers = {2, 7};

        System.out.println(Arrays.toString(solution(numbers)));
    }
}
