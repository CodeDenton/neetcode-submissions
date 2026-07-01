class Solution {
    public int missingNumber(int[] nums) {
        // 1 + 2 + 3 = 6 for loop
        // 1 + 3 = 4 for loop
        // 6-4 = 2 fial decision

        int expTotal = 0;
        for(int i=0; i<=nums.length; i++) {
            expTotal += i;
        }
        
        int actTotal = 0;
        for(int i=0; i<nums.length; i++) {
            actTotal += nums[i];
        }

        return Math.abs(expTotal - actTotal);

    }
}
