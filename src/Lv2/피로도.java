package Lv2;

public class 피로도 {
    public static int count = 0;
    public static int max = Integer.MIN_VALUE;
    public static void dfs(int k, int[][] dungeons, boolean[] visited) {
        int count = 0;
        for(int i = 0; i<visited.length; i++) {
            if(visited[i]) {
                count++;
            }
        }
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                k -= dungeons[i][1];
                dfs(k, dungeons, visited);
                visited[i] = false;
                k += dungeons[i][1];
            }
        }
        max = Math.max(max, count);
    }

    public static int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        dfs(k, dungeons, visited);
        return max;
    }

    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};

        System.out.println(solution(k, dungeons));
    }
}
