package Lv2;

import java.util.ArrayList;

public class 캐시 {
    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>(cacheSize);
        if (cacheSize == 0)
            return cities.length * 5;
        for (String c : cities) {
            String ss = c.toLowerCase();
            if (list.size() < cacheSize) {
                if (list.contains(ss)) {
                    list.remove(ss);
                    list.add(ss);
                    answer += 1;
                } else {
                    list.add(ss);
                    answer += 5;
                }

                continue;
            }
            if (!list.contains(ss)) {
                list.remove(0);
                list.add(ss);
                answer += 5;
            } else {
                list.remove(ss);
                list.add(ss);
                answer += 1;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        System.out.println(solution(cacheSize, cities));
    }
}
