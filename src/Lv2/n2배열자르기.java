package Lv2;

import java.util.ArrayList;
import java.util.Arrays;

public class n2배열자르기 {
    public static int[] solution(int n, long left, long right) {
        ArrayList<Integer> list = new ArrayList<>();

        for (long i = left + 1; i <= right + 1; i++) {
            long x = (long) Math.ceil((double) i / n);
            long y = i % n;
            if (y == 0)
                y = n;
            list.add((int) Math.max(x, y));
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }

    public static void main(String[] args) {
        int n = 4;
        long left = 7;
        long right = 14;

        System.out.println(Arrays.toString(solution(n, left, right)));
    }
}
