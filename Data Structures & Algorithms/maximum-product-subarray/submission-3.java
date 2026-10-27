class Solution {
    public int maxProduct(int[] nums) {
        int result = nums[0];
        int numMax = nums[0];
        int numMin = nums[0];

        for(int i=1; i<nums.length; i++) {
            int n = nums[i];
            int tempMax = Math.max(n, Math.max(numMax*n, numMin*n));
            numMin = Math.min(n, Math.min(numMax*n, numMin*n));
            numMax = tempMax;
            result = Math.max(result, numMax);
        }
        return result;
    }
}
