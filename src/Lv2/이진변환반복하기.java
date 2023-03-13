package Lv2;

import java.util.Arrays;

public class 이진변환반복하기 {
    public static int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int c = 0;
        while (!s.equals("1")) {
            c++;
            String temp = "";
            int x = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0')
                    x++;
            }
            s = Integer.toBinaryString(s.length() - x);
            count += x;
        }
        answer[0] = c;
        answer[1] = count;

        return answer;
    }

    public static void main(String[] args) {
        String s = "110010101001";

        System.out.println(Arrays.toString(solution(s)));
    }
}
