package Lv2;

import java.util.Arrays;

public class N개의최소공배수 {
    public static int solution(int[] arr) {
        int answer = 1;
        Arrays.sort(arr);

        int[] temp = new int[arr[arr.length - 1] + 1];

        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            int[] t = new int[n + 1];
            for (int j = 2; j <= Math.sqrt(n); j++) {
                while (n % j == 0) {
                    t[j] += 1;
                    n /= j;
                }
            }
            if (n != 1)
                t[n] += 1;
            for (int k = 0; k < temp.length && k < t.length; k++) {
                if (temp[k] < t[k])
                    temp[k] = t[k];
            }
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 0)
                answer *= Math.pow(i, temp[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};

        System.out.println(solution(arr));
    }
}
