package Lv2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 프린터 {
    public static int solution(int[] priorities, int location) {
        Queue<Integer> q = new LinkedList<>();
        for (int i : priorities)
            q.offer(i);

        Arrays.sort(priorities);

        int count = 0;
        int y = priorities.length - 1;
        while (!q.isEmpty()) {
            int x = q.poll();
            if (x < priorities[y]) {
                q.offer(x);
                if (location == 0)
                    location = q.size() - 1;
                else
                    location--;
            }
            else {
                count++;
                if (priorities[y] == x && location == 0)
                    break;
                y--;
                location--;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;

        System.out.println(solution(priorities, location));
    }
}
