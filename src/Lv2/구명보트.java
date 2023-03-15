package Lv2;

import java.util.Arrays;
import java.util.Collections;

public class 구명보트 {
    public static int solution(int[] people, int limit) {
        int answer = 0;
        Integer[] p = Arrays.stream(people).boxed().toArray(Integer[]::new);
        Arrays.sort(p, Collections.reverseOrder());
        int i = 0;
        int j = 0;
        int count = 0;
        while (count < p.length) {
            if (p[i] + p[p.length - 1 - j] <= limit) {
                count += 2;
                i++;
                j++;
            }
            else {
                i++;
                count++;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;

        System.out.println(solution(people, limit));
    }
}
