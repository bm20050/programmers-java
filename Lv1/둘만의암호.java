package Lv1;

public class 둘만의암호 {
    public static String solution(String s, String skip, int index) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            int x = (int) s.charAt(i);
            int count = 0;
            while (count != index) {
                if (x == (int) 'z')
                    x = (int) 'a' - 1;
                count += 1;
                x += 1;

                for (int j = 0; j < skip.length(); j++) {
                    if (skip.charAt(j) == x) {
                        count -= 1;
                    }
                }
            }
            answer += (char) x;
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;

        System.out.println(solution(s, skip, index));
    }
}
