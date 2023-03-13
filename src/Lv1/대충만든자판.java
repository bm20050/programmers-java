package Lv1;

import java.util.Arrays;

public class 대충만든자판 {
    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int i = 0, j = 0, k = 0, l = 0, count = 0;
        int minCount = 100;

        while (i < targets.length) {
            while(j < targets[i].length()) {
                while(k < keymap.length) {
                    // minCount = keymap[k].length() + 1;
                    while (l < keymap[k].length()) {
                        if (targets[i].charAt(j) == keymap[k].charAt(l)) {
                            minCount = Math.min(minCount, l + 1);
                            break;
                        }
                        l++;
                    }
                    if (minCount == 100)
                        count = -1;
                    else
                        count += minCount;
                    minCount = 100;
                    k++;
                }

                j++;
            }
            answer[i] = count;
            i++;
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD", "AABB"};

        System.out.println(Arrays.toString(solution(keymap, targets)));
    }
}
