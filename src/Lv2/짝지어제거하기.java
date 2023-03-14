package Lv2;


import java.util.Stack;

public class 짝지어제거하기 {
    public static int solution(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (st.isEmpty() || s.charAt(i) != st.peek())
                st.push(s.charAt(i));
            else
                st.pop();
        }
        if (st.isEmpty())
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        String s = "baabaa";

        System.out.println(solution(s));
    }
}
