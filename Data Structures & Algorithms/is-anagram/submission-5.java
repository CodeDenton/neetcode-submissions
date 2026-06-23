class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        System.out.println(charS);
        System.out.println(charT);
        if(Arrays.equals(charS,charT)) {
            return true;
        } else {
            return false;
        }
    }
}
