class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> nums2 = new ArrayList<>();
         for(int i=0; i<nums.length; i++) {
            if(nums2.contains(nums[i])) return true;
            nums2.add(nums[i]);
         }
         return false;

        
    }
}