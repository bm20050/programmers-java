package Lv2;

import java.util.HashMap;
import java.util.Iterator;

public class 위장 {
    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] s : clothes) {
            if (!map.containsKey(s[1])) {
                map.put(s[1], 1);
            } else {
                map.put(s[1], map.get(s[1]) + 1);
            }
        }

        Iterator<Integer> iter = map.values().iterator();

        while (iter.hasNext()) {
            answer *= iter.next().intValue() + 1;
        }
        return answer - 1;
    }

    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.println(solution(clothes));
    }
}
