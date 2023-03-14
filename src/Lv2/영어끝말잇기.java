package Lv2;

import java.util.ArrayList;
import java.util.Arrays;

public class 영어끝말잇기 {
    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> list = new ArrayList<>();
        list.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (!words[i - 1].substring(words[i - 1].length() - 1).equals(words[i].substring(0, 1))) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            if (list.contains(words[i])) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            list.add(words[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

        System.out.println(Arrays.toString(solution(n, words)));
    }
}
