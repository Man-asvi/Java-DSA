package Backtracking;

public class RatMaze {

    public static boolean isSafe(int maze[][], int i, int j, int n, int m) {
        return (i >= 0 && i < n && j >= 0 && j < m && maze[i][j] == 1);
    }

    public static int ratWays(int maze[][], int i, int j, int n, int m) {
         if (i == n-1 && j == m-1) {
            return 1;
        }

        if (!isSafe(maze, i, j, n, m)) {
            return 0;
        }

        maze[i][j] = 0;

        int w1 = ratWays(maze, i+1, j, n, m);
        int w2 = ratWays(maze, i, j+1, n, m);
        int w3 = ratWays(maze, i-1, j, n, m);
        int w4 = ratWays(maze, i, j-1, n, m);

        maze[i][j] = 1;

        return w1 + w2 + w3 + w4;
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 1, 1, 1},
            {0, 1, 0, 1},
            {1, 1, 1, 1},
            {1, 0, 1, 1}
        };

        System.out.println(ratWays(maze, 0, 0, maze.length, maze[0].length));

    }
}