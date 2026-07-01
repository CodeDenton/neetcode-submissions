class Solution {
    public int missingNumber(int[] nums) {
        // [0, 1, 2, 3] = 0 + 1 + 2 + 3 = 6
        // [0, 1, 3] = 0 + 1 + 3 = 4
        // expected = 6
        // actual = 4
        // expected - actual = 2 = missing number

        int expNumber = 0;
        for(int i=0; i<=nums.length; i++) {
            expNumber += i;
        }

        int actNum = 0;
        for(int i=0; i<nums.length; i++) {
            actNum += nums[i];
        }

        return Math.abs(expNumber - actNum);
    }
}
