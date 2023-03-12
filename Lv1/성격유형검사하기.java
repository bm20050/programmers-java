package Lv1;

import java.util.Arrays;

public class 성격유형검사하기 {
    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        String[] score = {"RT", "TR", "FC", "CF", "MJ", "JM", "AN", "NA"};
        int[] s = new int[4];
        for (int i = 0; i < survey.length; i++) {
            for (int j = 0; j < score.length; j++) {
                if (survey[i].equals(score[j])) {
                    if (j % 2 != 0)
                        s[j / 2] += choices[i] - 4;
                    else
                        s[j / 2] += 4 - choices[i];
                }
            }
        }
        for (int i = 0; i < s.length; i++) {
            if (s[i] > 0)
                answer += score[i * 2].substring(0, 1);
            else if (s[i] < 0)
                answer += score[i * 2].substring(1, 2);
            else{
                String[] temp = score[i * 2].split("");
                Arrays.sort(temp);
                answer += temp[0];
            }


        }
        return answer;
    }

    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};

        System.out.println(solution(survey, choices));
    }
}
