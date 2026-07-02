class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        if(Arrays.equals(sChar, tChar)) return true;
        return false;
    }
}
