class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int max = 0;
        while(left < right) {
            int width = right - left;
            int height = Math.min(heights[right], heights[left]);
            int sum = height * width;
            if(sum > max) max = sum;
            if(heights[left] > heights[right]) right--;
            else left++;
        }
        return max;
    }
}
