class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int result = nums[0];

        while(left <= right) {
            if(nums[left] < nums[right]){ 
                result = Math.min(result, nums[left]);
                break;
            }

            int mid = (left+right) / 2;
            if(nums[mid] >= nums[left]) {
                // search right
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            result = Math.min(result, nums[mid]);
        }
        return result;
    }
}
