package Lv2;


public class JadenCase문자열만들기 {
    public static String solution(String s) {
        String answer = "";
        String[] ss = s.split(" ");
        String[] sss = new String[ss.length];
        int i = 0;
        for (String a : ss) {
            if (!a.equals("")) {
                sss[i++] = a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase();
            }
        }
        for (int j = 0; j < sss.length && sss[j] != null; j++) {
            answer += sss[j] + " ";
        }
        answer = answer.strip();
        return answer;
    }

    public static void main(String[] args) {
        String s1 = "3people   unFollowed me";
        String s2 = "for the last week";

        System.out.println(solution(s1));
        System.out.println(solution(s2));
    }
}
