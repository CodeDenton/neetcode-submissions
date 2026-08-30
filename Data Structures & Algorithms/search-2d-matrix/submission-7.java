class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n = matrix[0].length-1;

        for(int[] g : matrix) {
            if(g[n] >= target) {
                return binarySearch(g, target, 0, n);
            }
        }
        return false;
    }

    public boolean binarySearch(int[] matrix, int target, int left, int right) {
        if(left > right) return false;

        int mid = (left + right) / 2;

        if(matrix[mid] == target) return true;
        
        if(matrix[mid] > target) {
            return binarySearch(matrix, target, left, mid-1);
        } else {
            return binarySearch(matrix, target, mid+1, right);
        }
    }
}
