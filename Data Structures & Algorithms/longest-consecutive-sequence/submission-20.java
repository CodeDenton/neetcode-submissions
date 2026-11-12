class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }

        int best = 0;
        for(int num : set) {
            if(!set.contains(num-1)) {
                int length = 1;
                while(set.contains(num+length)) {
                    length++;
                }
                best = Math.max(best, length);
            }
        }
        return best;
    }
}
