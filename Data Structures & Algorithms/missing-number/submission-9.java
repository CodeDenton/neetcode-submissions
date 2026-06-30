class Solution {
    public int missingNumber(int[] nums) {
        int expectedSum = 0;
        for(int i=0; i<=nums.length; i++) {
            expectedSum += i;
        }
        int actualSum = 0;
        for(int i=0; i<nums.length; i++) {
            actualSum += nums[i];
        }
        return Math.abs(expectedSum - actualSum);


        
    }
}
