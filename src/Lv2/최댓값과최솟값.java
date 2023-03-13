package Lv2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 최댓값과최솟값 {
    public static String solution(String s) {
        String[] temp = s.split(" ");
        int[] t = new int[temp.length];
        for (int i = 0; i < temp.length; i++)
            t[i] = Integer.parseInt(temp[i]);
        Arrays.sort(t);
        String answer = t[0] + " " + t[temp.length - 1];
        return answer;
    }

    public static void main(String[] args) {
        String s = "-1 -2 -3 -4";
        System.out.println(solution(s));
    }
}
