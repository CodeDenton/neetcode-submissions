class Solution {
    public int maxProduct(int[] nums) {
        int result = nums[0];
        int max = nums[0];
        int min = nums[0];

        for(int i=1; i<nums.length; i++) {
            int x = nums[i];
            int currMax = max;
            int currMin = min;

            max = Math.max(x, Math.max(currMax*x, currMin*x));
            min = Math.min(x, Math.min(currMax*x, currMin*x));

            result = Math.max(max, result);
        }
        return result;
    }
}
