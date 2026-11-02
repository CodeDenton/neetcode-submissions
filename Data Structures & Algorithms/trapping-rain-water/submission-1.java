class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxLeft = 0;
        int maxRight = 0;
        int water = 0;

        for(int n : height) {
            if(height[left] <= height[right]) {
                maxLeft = Math.max(maxLeft, height[left]);
                water += maxLeft - height[left];
                left++;
            } else {
                maxRight = Math.max(maxRight, height[right]);
                water += maxRight - height[right];
                right--;
            }
        }
        return water;
    }
}
