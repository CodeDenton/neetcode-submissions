class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        Queue<int[]> queue = new LinkedList<>();

        for(int r=0; r<board.length; r++) {
            for(int c=0; c<board[0].length; c++) {
                if(c == 0 || c == n-1 || r == 0 || r == m-1){
                    if(board[r][c] == 'O') queue.offer(new int[] {r, c});
                }
            }
        }
        int[][] dirs = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        while(!queue.isEmpty()) {
            int[] curr = queue.poll();
            board[curr[0]][curr[1]] = 'S';
            for(int[] d : dirs) {
                int nr = curr[0] + d[0];
                int nc = curr[1] + d[1];
                if(nr<0 || nr>= m || nc<0 || nc>= n || board[nr][nc] != 'O') continue;
                queue.offer(new int[] {nr,nc});
            }
        }

        for(int r=0; r<m; r++) {
            for(int c=0; c<n; c++) {
                if(board[r][c] == 'O') {
                    board[r][c] = 'X';
                } else if(board[r][c] == 'S') {
                    board[r][c] = 'O';
                }
            }
        }
        
        return;
    }
}
