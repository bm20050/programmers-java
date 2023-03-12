package Lv1;

import java.util.ArrayList;

public class 햄버거만들기 {
    public static int solution(int[] ingredient) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : ingredient)
            list.add(i);
        while (true) {
            boolean flag = false;
            for (int i = 0; i < list.size() - 3; i++) {
                if (list.get(i) == 1 && list.get(i + 1) == 2 && list.get(i + 2) == 3 && list.get(i + 3) == 1) {
                    answer += 1;
                    for (int j = 0; j < 4; j++)
                        list.remove(i);
                    flag = true;
                    if (i >= 2)
                        i -= 3;
                    else
                        i = -1;
                }
            }
            if (!flag)
                break;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int[] ingredient2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        System.out.println(solution(ingredient));
        System.out.println(solution(ingredient2));
    }
}
