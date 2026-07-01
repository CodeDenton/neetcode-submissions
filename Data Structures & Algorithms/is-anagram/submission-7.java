class Solution {
    public boolean isAnagram(String s, String t) {
        //convert to char array
        // sort both
        // check if there equal
        // true if equal
        // false if not

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        if(Arrays.equals(sChars, tChars)) return true;
        return false;


    }
}
