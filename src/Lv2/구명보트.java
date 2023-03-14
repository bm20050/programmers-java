package Lv2;

import java.util.Arrays;
import java.util.Stack;

public class 구명보트 {
    public static int solution(int[] people, int limit) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        Arrays.sort(people);
        int sum = 0;
        for (int i = 0; i < people.length; i++) {
            if (st.isEmpty()) {
                st.push(people[i]);
                sum += people[i];
            }
            else {
                answer += 1;

                if (sum + people[i] < limit)
                st.push(people[i]);
                sum += people[i];

            }
            else {
                answer += 1;
                st.clear();
                st.push(people[i]);
                sum += people[i];
            }
        }
        return answer + 1;
    }

    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;

        System.out.println(solution(people, limit));
    }
}
