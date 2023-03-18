package Lv2;

import java.util.Arrays;
import java.util.Collections;

public class H_Index {
    public static int solution(int[] citations) {
        int answer = 0;
        Integer[] c = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(c, Collections.reverseOrder());

        if (c[c.length - 1] >= c.length)
            return c.length;
        for (int i = 0; i < c.length - 1; i++) {
            if (i + 1 <= c[i] && i + 1 >= c[i + 1]) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};

        System.out.println(solution(citations));
    }
}
