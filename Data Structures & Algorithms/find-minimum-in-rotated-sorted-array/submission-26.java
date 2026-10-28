class Solution {
    public int findMin(int[] nums) {
        // [3,4,5,6,1,2]
        int result = nums[0];
        int left = 0;
        int right = nums.length-1;

        while(left <= right) {
            int mid = left + (right-left) / 2;

            if(nums[left] < nums[right]) {
                result = Math.min(result, nums[left]);
                break;
            }

            if(nums[right] > nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            result = Math.min(result, nums[mid]);
        }
        return result;
    }
}
