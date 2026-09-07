class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int result = nums[0];

        while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[left] < nums[right]) {
                result = Math.min(nums[left], result);
                break;
            }

            if(nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            result = Math.min(nums[mid], result);
        }
        return result;
    }
}