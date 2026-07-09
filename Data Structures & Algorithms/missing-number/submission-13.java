class Solution {
    public int missingNumber(int[] nums) {
        // 0 + 1 + 2 + 3 = 6
        // 0 + 1 + 3 = 4
        //6 - 4 = 2
        int x = 0;
        for(int i=0; i<=nums.length; i++) {
            x += i;
        }
        int y = 0;
        for(int i=0; i<nums.length; i++) {
            y += nums[i];
        }
        return Math.abs(x-y);
    }
}
