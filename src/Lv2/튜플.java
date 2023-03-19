package Lv2;

import java.util.*;

public class 튜플 {
    public static int[] solution(String s) {
        s = s.replaceAll("[{}]", "");
        HashSet<String> set = new HashSet<>();
        String[] ss = s.split(",");
        for (String sss : ss) {
            set.add(sss);
        }
        int[] answer = new int[set.size()];
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            String i = iter.next();
            answer[4 - Collections.frequency(Arrays.asList(ss), i)] = Integer.parseInt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";

        System.out.println(Arrays.toString(solution(s)));
    }
}
