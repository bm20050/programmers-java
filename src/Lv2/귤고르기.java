package Lv2;

import java.util.*;
import java.util.stream.Collectors;

public class 귤고르기 {
    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>(Arrays.stream(tangerine).boxed().collect(Collectors.toList()));
        Iterator iter = hs.iterator();
        Integer[] t = Arrays.stream(tangerine).boxed().toArray(Integer[]::new);
        while (iter.hasNext()) {
            list.add(Collections.frequency(Arrays.asList(t), iter.next()));
        }
        Collections.sort(list);
        int sum = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            answer += 1;
            sum += list.get(i);
            if (sum >= k)
                break;
        }
        return answer;
    }

    public static void main(String[] args) {
        int k = 6;
        int[] tagerine = {1, 3, 2, 5, 4, 5, 2, 3};

        System.out.println(solution(k, tagerine));
    }
}
