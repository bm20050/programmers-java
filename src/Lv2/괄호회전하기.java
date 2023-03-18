package Lv2;

import java.util.Stack;

public class 괄호회전하기 {
    public static int solution(String s) {
        int answer = 0;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String ss = s.substring(i) + s.substring(0, i);
            st.clear();
            for (int j = 0; j < ss.length(); j++) {
                if (st.isEmpty())
                    st.push(ss.charAt(j));
                else {
                    if (st.peek() == '[' && ss.charAt(j) == ']')
                        st.pop();
                    else if (st.peek() == '(' && ss.charAt(j) == ')')
                        st.pop();
                    else if (st.peek() == '{' && ss.charAt(j) == '}')
                        st.pop();
                    else
                        st.push(ss.charAt(j));
                }
            }
            if (st.isEmpty())
                answer += 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "[](){}";

        System.out.println(solution(s));
    }
}
