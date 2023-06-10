package Lv2;

public class 방문길이 {
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, -1, 0, 1};

    public static int solution(String dirs) {
        int answer = 0;
        boolean[][][] visited = new boolean[11][11][4];
        int x = 5, y = 5;
        for (int i = 0; i < dirs.length(); i++) {
            char c = dirs.charAt(i);
            int d = 0;

            if (c == 'U')
                d = 0;
            else if (c == 'L')
                d = 1;
            else if (c == 'D')
                d = 2;
            else
                d = 3;

            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx < 0 || ny < 0 || nx >= 11 || ny >= 11)
                continue;

            if (!visited[nx][ny][d]) {
                visited[nx][ny][d] = true;
                d = (d % 2 == 0) ? 2 - d : 4 - d;
                visited[x][y][d] = true;
                answer++;
            }
            x = nx;
            y = ny;
        }

        return answer;
    }

    public static void main(String[] args) {
        String dirs = "ULURRDLLU";

        System.out.println(solution(dirs));
    }
}
