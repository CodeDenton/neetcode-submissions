class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int r=0; r<grid.length; r++) {
            for(int c=0; c<grid[0].length; c++) {
                if(grid[r][c] == '1') {
                    count++;
                    sink(grid, r, c);
                }
            }
        }
        return count;
    }

    public void sink(char[][] grid, int row, int col) {
        if(row >= grid.length || col >= grid[0].length || row < 0 || col < 0 || grid[row][col] != '1') {
            return;
        }
        grid[row][col] = '0';
        sink(grid, row+1, col);
        sink(grid, row-1, col);
        sink(grid, row, col+1);
        sink(grid, row, col-1);
    }
}
