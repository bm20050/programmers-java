package Lv2;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> q = new LinkedList<>();
        int sum = 0;
        int time = 0;

        for (int i = 0; i < truck_weights.length; i++) {
            int truck = truck_weights[i];
            while (true) {
                if (q.isEmpty()) {
                    q.offer(truck);
                    sum += truck;
                    time++;
                    break;
                } else if (q.size() == bridge_length) {
                    sum -= q.poll();
                } else {
                    if (sum + truck <= weight) {
                        q.offer(truck);
                        sum += truck;
                        time++;
                        break;
                    } else {
                        q.offer(0);
                        time++;
                    }
                }
            }
        }
        return time + bridge_length;
    }

    public static void main(String[] args) {

        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};

        System.out.println(solution(bridge_length, weight, truck_weights));
    }
}
