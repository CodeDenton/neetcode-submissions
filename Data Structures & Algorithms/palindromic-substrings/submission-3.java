class Solution {
    public int countSubstrings(String s) {
        int total = 0;
        for(int i=0; i<s.length(); i++) {
            total += expand(s, i, i);
            total += expand(s, i, i+1);
        }

        return total;
    }

    public int expand(String s, int l, int r) {
        int count = 0;
        while(l >= 0 && r<s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
            count++;
        }

        return count;
    }
}
