class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for(int r=0; r<9; r++) {
            for(int c=0; c<9; c++) {
                char val = board[r][c];
                if(val == '.') continue;

                String rowTot = "Row" + r + "-" + val;
                String colTot = "Col" + c + "-" + val;
                String boxTot = "Box" + (r/3) + "-" + (c/3) + "-" + val;

                if(seen.contains(rowTot) || seen.contains(colTot) || seen.contains(boxTot)) {
                    return false;
                }

                seen.add(rowTot);
                seen.add(colTot);
                seen.add(boxTot);
            }
        }

        return true;
    }
}
