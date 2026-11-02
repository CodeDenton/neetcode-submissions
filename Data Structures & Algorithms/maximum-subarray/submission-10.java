class Solution {
    public int maxSubArray(int[] nums) {
        int curMax = 0;
        int best = nums[0];
        for(int n : nums) {
            curMax = Math.max(curMax + n, n);
            best = Math.max(curMax, best);
        }
        return best;
    }
}
