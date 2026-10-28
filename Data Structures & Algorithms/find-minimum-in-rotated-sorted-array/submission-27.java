class Solution {
    public int findMin(int[] nums) {
        int result = nums[0];
        int left = 0;
        int right = nums.length-1;

        while(left <= right) {
            if(nums[left] < nums[right]) {
                result = Math.min(nums[left], result);
                break;
            }

            int mid = left + (right-left) / 2;

            if(nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            result = Math.min(result, nums[mid]);
        }
        return result;
    }
}
