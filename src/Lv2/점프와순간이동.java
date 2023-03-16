package Lv2;

import java.util.*;

public class 점프와순간이동 {
    public static int solution(int n) {
        int ans = 0;
        String s = Integer.toBinaryString(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                ans += 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5000;

        System.out.println(solution(n));
    }
}
