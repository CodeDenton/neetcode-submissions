class Solution {
    public int numDecodings(String s) {
        if(s.charAt(0) == '0') return 0;

        int prev1 = 1;
        int prev2 = 1;

        for(int i=2; i<=s.length(); i++) {
            int cur = 0;

            if(s.charAt(i-1) != '0') {
                cur += prev1;
            }

            int two = Integer.parseInt(s.substring(i-2, i));
            if(two >= 10 && two <= 26) {
                cur += prev2;
            }

            prev2 = prev1;
            prev1 = cur;
        }
        return prev1;
    }
}
