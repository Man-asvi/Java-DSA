package Backtracking;

public class Knight {
    static int[] rowMoves = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] colMoves = {1, 2, 2, 1, -1, -2, -2, -1};

    public static boolean isSafe(int[][] board, int row, int col) {
        int n = board.length;
        return (row >= 0 && row < n && col >= 0 && col < n && board[row][col] == -1);
    }

    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static boolean knightTour(int[][] board, int row, int col, int moveCount) {
        int n = board.length;
        if (moveCount == n * n) {
            return true;
        }

        for (int i = 0; i < n; i++) {
            int nextRow = row + rowMoves[i];
            int nextCol = col + colMoves[i];

            if (isSafe(board, nextRow, nextCol)) {
                board[nextRow][nextCol] = moveCount;
                if (knightTour(board, nextRow, nextCol, moveCount + 1)) {
                    return true;
                }
                board[nextRow][nextCol] = -1; // Backtrack
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 8;
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = -1;
            }
        }

        board[0][0] = 0;

        if (knightTour(board, 0, 0, 1)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists");
        }
    }
}