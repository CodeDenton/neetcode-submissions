class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int r=0; r<m; r++) {
            for(int c=0; c<n; c++) {
                if(grid[r][c] == 1) {
                    count = Math.max(count, dfs(grid, r, c));
                }
            }
        }
        return count;
    }

    public int dfs(int[][] grid, int r, int c) {
            if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c] != 1) {
                return 0;
            }

            grid[r][c] = 0;
            return 1 + dfs(grid, r+1, c) + dfs(grid, r-1, c) + dfs(grid, r, c+1) + dfs(grid,r,c-1);
        }
}
