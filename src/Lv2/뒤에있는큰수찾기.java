package Lv2;

import java.util.Arrays;
import java.util.Stack;

public class 뒤에있는큰수찾기 {
    public static int[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[numbers.length];

        stack.push(0);
        for (int i = 1; i < numbers.length; i++) {
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 1, 10, 2, 10, 3, 10, 10, 10, 11, 11, 11, 12};

        System.out.println(Arrays.toString(solution(numbers)));
    }
}
