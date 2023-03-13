package Lv2;

public class 올바른괄호 {
    static boolean solution(String s) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                n += 1;
            else
                n -= 1;
            if (n < 0)
                return false;
        }
        if (n != 0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        String s = "()()";

        System.out.println(solution(s));
    }
}
