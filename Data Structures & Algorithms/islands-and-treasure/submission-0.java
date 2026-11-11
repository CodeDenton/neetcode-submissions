class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;

        for(int r=0; r<m; r++) {
            for(int c=0; c<n; c++) {
                if(grid[r][c] == 0) queue.offer(new int[]{r, c});
            }
        }

        int count = 1;
        int[][] dirs = {{1,0}, {0,1}, {-1, 0}, {0,-1}};

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0; i<size; i++) {
                int[] curr = queue.poll();
                for(int[] d : dirs) {
                    int nr = curr[0] + d[0];
                    int nc = curr[1] + d[1];
                    if(nr<0 || nr>=m || nc<0 || nc>=n || grid[nr][nc] != 2147483647) continue;
                    else {
                        grid[nr][nc] = count;
                        queue.offer(new int[] {nr, nc});
                    }
                }
            }
            count++;
        }
        return;
    }
}
