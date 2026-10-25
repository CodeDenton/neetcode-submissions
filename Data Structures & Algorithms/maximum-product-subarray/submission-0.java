class Solution {
    public int maxProduct(int[] nums) {
        int maxEnding = nums[0];
        int minEnding = nums[0];
        int result = nums[0];

        for(int i=1; i<nums.length; i++) {
            int x = nums[i];
            int a = maxEnding * x;
            int b = minEnding * x;

            maxEnding = Math.max(x, Math.max(a,b));
            minEnding = Math.min(x, Math.min(a,b));

            result = Math.max(result, maxEnding);
        }
        return result;
    }
}
