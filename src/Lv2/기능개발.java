package Lv2;

import java.util.ArrayList;
import java.util.Arrays;

public class 기능개발 {
    public static int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            list.add((int) Math.ceil((float) (100 - progresses[i]) / speeds[i]));
        }

        while (list.size() != 0) {
            int x = list.get(0);
            int count = 0;
            while (x >= list.get(0)) {
                count++;
                list.remove(0);
                if (list.size() == 0)
                    break;
            }
            a.add(count);
        }

        int[] answer = a.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }
}
