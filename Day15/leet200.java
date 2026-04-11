package Day15;

public class leet200 {

    // Main function
    public static int numIslands(char[][] grid) {

        int m = grid.length; // rows
        int n = grid[0].length; // columns
        int count = 0; // number of islands

        // traverse entire grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // if land found
                if (grid[i][j] == '1') {
                    count++; // new island
                    dfs(grid, i, j); // mark entire island
                }
            }
        }

        return count;
    }

    // DFS to mark connected land as visited
    private static void dfs(char[][] grid, int i, int j) {

        int m = grid.length;
        int n = grid[0].length;

        // boundary + water check
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0'; // mark visited (sink island)

        // explore 4 directions
        dfs(grid, i + 1, j); // down
        dfs(grid, i - 1, j); // up
        dfs(grid, i, j + 1); // right
        dfs(grid, i, j - 1); // left
    }

    public static void main(String[] args) {

        char[][] grid = {
                { '1', '1', '0', '0' },
                { '1', '1', '0', '0' },
                { '0', '0', '1', '0' },
                { '0', '0', '0', '1' }
        };

        int result = numIslands(grid);

        System.out.println("Number of Islands: " + result); // Output: 3
    }
}