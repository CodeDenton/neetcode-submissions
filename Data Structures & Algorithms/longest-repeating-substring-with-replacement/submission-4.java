class Solution {
    public int characterReplacement(String s, int k) {
        int result = 0;
        Set<Character> charSet = new HashSet<>();
        for(char c : s.toCharArray()) {
            charSet.add(c);
        }

        for(char c : charSet) {
            int left = 0;
            int count = 0;
            for(int right = 0; right < s.length(); right++) {
                if(s.charAt(right) == c) {
                    count++;
                }

                while((right - left + 1) - k > count) {
                    if(s.charAt(left) == c) {
                        count--;
                    }
                    left++;
                }
                result = Math.max(result, right-left+1);
            }
        }
        return result;
    }
}
