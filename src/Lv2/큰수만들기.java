package Lv2;

public class 큰수만들기 {
    public static String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i = 0; i < number.length() - k; i++) {
            int max = 0;
            for (int j = index; j <= k + i; j++) {
                if (max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    index = j + 1;
                }
            }
            sb.append(max);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String number = "909090";
        int k = 3;

        System.out.println(solution(number, k));
    }
}
