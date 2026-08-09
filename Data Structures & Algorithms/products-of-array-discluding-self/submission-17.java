class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        // prefix
        for(int i=1; i < nums.length; i++) {
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
