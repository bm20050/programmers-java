package Lv2;

import java.util.PriorityQueue;

public class 더맵게 {
    public static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            pq.offer(scoville[i]);
        }

        int count = 0;
        boolean flag = false;
        while (pq.size() >= 2) {
            int x = pq.poll();
            int y = pq.poll();
            if (x >= K) {
                flag = true;
                break;
            }

            pq.offer(x + y * 2);
            count++;
        }
        if (pq.size() == 1) {
            if (pq.peek() >= K)
                flag = true;
        }
        if (flag)
            return count;
        else
            return -1;
    }

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        System.out.println(solution(scoville, K));
    }
}
