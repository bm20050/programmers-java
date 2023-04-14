package Lv1;

import java.util.Arrays;
import java.util.HashMap;

public class 달리기경주 {
    public static String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i + 1);
        }

        for (int i = 0; i < callings.length; i++) {
            int x = map.get(callings[i]);
            if (x != 1) {
                String temp = players[x - 1];
                players[x - 1] = players[x - 2];
                players[x - 2] = temp;
            }
            map.put(players[x - 2], map.get(players[x - 2]) - 1);
            map.put(players[x - 1], map.get(players[x - 1]) + 1);
        }

        for (String s : map.keySet()) {
            answer[map.get(s) - 1] = s;
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        System.out.println(Arrays.toString(solution(players, callings)));
    }
}
