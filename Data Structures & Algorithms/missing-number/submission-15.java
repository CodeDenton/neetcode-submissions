class Solution {
    public int missingNumber(int[] nums) {
        // 0 + 1 + 2 + 3 = 6
        // 0 + 1 + 3 = 4
        //6 - 4 = 2 is missing number
        int m = 0;
        for(int i=0; i<=nums.length; i++) {
            m += i;
        }
        int n = 0;
        for(int i=0; i < nums.length; i++) {
            n += nums[i];
        }
        return m-n;
    }
}
