class Solution {
    public int maxSubArray(int[] nums) {
        int curSum = 0;
        int best = nums[0];
        for(int n : nums) {
            curSum = Math.max(curSum + n, n);
            best = Math.max(best, curSum);
        }
        return best;
    }
}
