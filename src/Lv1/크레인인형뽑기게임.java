package Lv1;

public class 크레인인형뽑기게임 {
    public static int solution(int[][] board, int[] moves) {
        int[] array = new int[board.length * board.length];
        int x = 0;
        int count = 0;
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    array[x++] = board[j][moves[i] - 1];
                    board[j][moves[i] - 1] = 0;
                    if (x > 1) {
                        if (array[x - 1] == array[x - 2]) {
                            x -= 2;
                            count += 2;
                        }
                    }
                    break;
                }

            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println(solution(board, moves));
    }
}

