class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> noDups = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            if(noDups.contains(nums[i])) return true;
            noDups.add(nums[i]);
        }
        return false;
    }
}