class Solution {
    public boolean isAnagram(String s, String c) {
        char[] sChar = s.toCharArray();
        char[] cChar = c.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(cChar);
        return Arrays.equals(sChar, cChar);
    }
}
