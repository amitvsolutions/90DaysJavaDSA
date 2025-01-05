import java.util.*;

public class MazeSolver {

    // Direction vectors for moving Up, Down, Left, Right
    private static final int[] rowDir = {-1, 1, 0, 0}; 
    private static final int[] colDir = {0, 0, -1, 1}; 

    // Function to check if the cell is valid (inside the maze, not a wall, and not visited)
    private static boolean isValid(int row, int col, int[][] maze, boolean[][] visited) {
        return row >= 0 && col >= 0 && row < maze.length && col < maze[0].length && maze[row][col] == 0 && !visited[row][col];
    }

    // BFS algorithm to find the shortest path
    public static int bfs(int[][] maze, int startRow, int startCol, int endRow, int endCol) {
        int n = maze.length;
        int m = maze[0].length;

        // Queue for BFS, stores pairs (row, col) and the current distance
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {startRow, startCol, 0}); // starting point with distance 0

        // Visited array to avoid revisiting cells
        boolean[][] visited = new boolean[n][m];
        visited[startRow][startCol] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0], col = current[1], distance = current[2];

            // If we reached the destination
            if (row == endRow && col == endCol) {
                return distance;
            }

            // Explore the neighbors (Up, Down, Left, Right)
            for (int i = 0; i < 4; i++) {
                int newRow = row + rowDir[i];
                int newCol = col + colDir[i];

                if (isValid(newRow, newCol, maze, visited)) {
                    visited[newRow][newCol] = true;
                    queue.add(new int[] {newRow, newCol, distance + 1});
                }
            }
        }

        // Return -1 if there's no path
        return -1;
    }

    public static void main(String[] args) {
        // Example maze:
        // 0 -> open path, 1 -> wall
        int[][] maze = {
            {0, 0, 1, 0, 0},
            {0, 1, 1, 0, 0},
            {0, 0, 0, 1, 0},
            {0, 1, 0, 0, 0},
            {0, 0, 0, 1, 0}
        };

        int startRow = 0, startCol = 0;  // Starting point (top-left corner)
        int endRow = 4, endCol = 4;      // Ending point (bottom-right corner)

        int result = bfs(maze, startRow, startCol, endRow, endCol);

        if (result != -1) {
            System.out.println("Shortest path length: " + result);
        } else {
            System.out.println("No path exists.");
        }
    }
}

