package Lv2;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수 {
    public static String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] nums = new String[numbers.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(nums, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        if (nums[0].equals("0"))
            return "0";
        else {
            for (int i = 0; i < nums.length; i++) {
                answer.append(nums[i]);
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};

        System.out.println(solution(numbers));
    }
}
