class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> prevMap = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int sum = target - nums[i];
            if(prevMap.containsKey(sum)) return new int[] {prevMap.get(sum), i};
            prevMap.put(nums[i], i);
        }
        return new int[0];
    }
}
