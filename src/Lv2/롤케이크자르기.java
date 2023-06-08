package Lv2;

import java.util.HashMap;
import java.util.HashSet;

public class 롤케이크자르기 {
    public static int solution(int[] topping) {
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < topping.length; i++) {
            map.put(topping[i], map.getOrDefault(topping[i], 0) + 1);
        }

        int count = 0;
        for (int i = 0; i < topping.length; i++) {
            set.add(topping[i]);
            map.put(topping[i], map.get(topping[i]) - 1);

            if (map.get(topping[i]) == 0)
                map.remove(topping[i]);
            if (set.size() == map.size())
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};

        System.out.println(solution(topping));
    }
}
