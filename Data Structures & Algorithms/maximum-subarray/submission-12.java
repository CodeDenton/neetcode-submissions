class Solution {
    public int maxSubArray(int[] nums) {
        int best = 0;
        int curBest = nums[0];
        for(int n : nums) {
            best = Math.max(best + n, n);
            curBest = Math.max(curBest, best);
        }

        return curBest;
    }
}
