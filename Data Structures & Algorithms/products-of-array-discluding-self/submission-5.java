class Solution {
    public int[] productExceptSelf(int[] nums) {
        // 2#Hi
        //prefix
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        for(int i=1; i<nums.length; i++) {
            result[i] = result[i-1] * nums[i-1];
        }
        //postfix
        int postfix = 1;
        for(int i=nums.length-1; i >= 0; i--) {
            result[i] *= postfix;
            postfix *= nums[i];
        }

        return result;
    }
}  
