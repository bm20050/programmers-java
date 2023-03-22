package Lv2;

import java.util.ArrayList;

public class 뉴스클러스터링 {
    public static int solution(String str1, String str2) {
        int answer = 0;
        ArrayList<String> s1 = new ArrayList<>();
        ArrayList<String> s2 = new ArrayList<>();

        for (int i = 0; i < str1.length() - 1; i++) {
            if (Character.isAlphabetic(str1.charAt(i)) && Character.isAlphabetic(str1.charAt(i + 1)))
                s1.add(str1.substring(i, i + 2).toLowerCase());
        }
        for (int i = 0; i < str2.length() - 1; i++) {
            if (Character.isAlphabetic(str2.charAt(i)) && Character.isAlphabetic(str2.charAt(i + 1)))
                s2.add(str2.substring(i, i + 2).toLowerCase());
        }
        if (s1.size() == 0 && s2.size() == 0)
            return 65536;
        int sz = s2.size();
        int count = 0;
        for (int i = 0; i < s1.size(); i++) {
            String s = s1.get(i);
            for (int j = 0; j < s2.size(); j++) {
                if (s2.get(j).equals(s)) {
                    s2.remove(j);
                    count += 1;
                    break;
                }
            }
        }

        answer = (int) Math.floor((float) count / (s1.size() + sz - count) * 65536);

        return answer;
    }

    public static void main(String[] args) {
        String str1 = "abab";
        String str2 = "baba";

        System.out.println(solution(str1, str2));
    }
}
