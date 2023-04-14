package Lv2;

import java.util.HashMap;

public class 할인행사 {
    public static int solution(String[] want, int[] number, String[] discount) {

        int count = 0;
        for (int i = 0; i < discount.length - 9; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            for (int j = i; j < i + 10; j++) {
                if (map.get(discount[j]) == null)
                    map.put(discount[j], 1);
                else
                    map.put(discount[j], map.get(discount[j]) + 1);
            }
            boolean flag = true;
            for (int k = 0; k < want.length; k++) {
                if (map.get(want[k]) == null || map.get(want[k]) != number[k]) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        System.out.println(solution(want, number, discount));

        String[] want1 = {"apple"};
        int[] number1 = {10};
        String[] discount1 = {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"};

        System.out.println(solution(want1, number1, discount1));
    }
}
