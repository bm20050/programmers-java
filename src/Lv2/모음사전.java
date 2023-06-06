package Lv2;

public class 모음사전 {
    public static String[] vowels = {"A", "E", "I", "O", "U"};
    public static int count = 0;
    public static int result = 0;
    public static void dfs(String s, String word) {
        if (s.length() > 5)
            return;

        count++;
        if (word.equals(s)) {
            result = count;
            return;
        }

        for (int i = 0; i < vowels.length; i++) {
            dfs(s + vowels[i], word);
        }
    }

    public static int solution(String word) {

        for (int i = 0; i < vowels.length; i++) {
            dfs(vowels[i], word);
        }

        return result;
    }

    public static void main(String[] args) {
        String word = "AAAAE";

        System.out.println(solution(word));
    }
}
