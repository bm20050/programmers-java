package Lv2;

public class 타겟넘버 {

    public static int dfs(int prev, int index, int[] numbers, int target) {
        if (index >= numbers.length) {
            if (target == prev) {
                return 1;
            }
            return 0;
        }
        int cur1 = prev + numbers[index];
        int cur2 = prev - numbers[index];

        int ans = 0;
        ans += dfs(cur1, index + 1, numbers, target);
        ans += dfs(cur2, index + 1, numbers, target);

        return ans;
    }
    public static int solution(int[] numbers, int target) {
        int answer = 0;
        int current = numbers[0];

        answer += dfs(current, 1, numbers, target);
        answer += dfs(-current, 1, numbers, target);
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        System.out.println(solution(numbers, target));
    }
}
