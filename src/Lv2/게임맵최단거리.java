package Lv2;

import java.util.LinkedList;
import java.util.Queue;

public class 게임맵최단거리 {
    static class Node {
        private int x;
        private int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static int bfs(int[][] maps, int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y));
        while (!q.isEmpty()) {
            Node node = q.poll();
            x = node.getX();
            y = node.getY();

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= maps.length || ny >= maps[nx].length)
                    continue;
                if (maps[nx][ny] == 0)
                    continue;

                if (maps[nx][ny] == 1) {
                    maps[nx][ny] = maps[x][y] + 1;
                    q.offer(new Node(nx, ny));
                }
            }
        }
        if (maps[maps.length - 1][maps[0].length - 1] != 1)
            return maps[maps.length - 1][maps[0].length - 1];
        else
            return -1;
    }

    public static int solution(int[][] maps) {
        return bfs(maps, 0, 0);
    }

    public static void main(String[] args) {
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};

        System.out.println(solution(maps));
    }
}
