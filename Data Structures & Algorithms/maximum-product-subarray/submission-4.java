class Solution {
    public int maxProduct(int[] nums) {
        int result = nums[0];
        int curMax = nums[0];
        int curMin = nums[0];

        for(int i=1; i<nums.length; i++) {
            int x = nums[i];
            int tempMax = Math.max(x, Math.max(curMax*x, curMin*x));
            curMin = Math.min(x, Math.min(curMax*x, curMin*x));
            curMax = tempMax;
            result = Math.max(curMax, result);
        }
        return result;
    }
}
