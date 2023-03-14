package Lv2;

import java.util.ArrayList;
import java.util.Arrays;

public class 카펫 {
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int x = 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (x < yellow / x) {
            if (yellow % x == 0) {
                list.add(x);
            }
            x++;
        }
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i) + 2) * (yellow / list.get(i) + 2) - yellow == brown) {
                answer[0] = yellow / list.get(i) + 2;
                answer[1] = list.get(i) + 2;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2;

        System.out.println(Arrays.toString(solution(brown, yellow)));
    }
}
