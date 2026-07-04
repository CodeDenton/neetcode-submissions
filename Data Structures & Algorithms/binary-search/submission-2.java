class Solution {
    public int search(int[] nums, int target) {
        // [1, 3, 4, 5] target = 3 : return 1. return i;
        int temp = -1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) return i;
        }
        return temp;
    }
}
