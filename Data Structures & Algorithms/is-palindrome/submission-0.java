class Solution {
    public boolean isPalindrome(String s) {
        char[] forward = new char[100];
        char[] backward = new char[100];
        int count1 = 0;
        int count2 = 0;
        for(int i=0; i<=s.length()-1; i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                forward[count1] = Character.toLowerCase(s.charAt(i));
                count1++;
        }
        }
        for(int i=s.length()-1; i>=0; i--) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                backward[count2] = Character.toLowerCase(s.charAt(i));
                count2++;
            }
        }
        for(int i=0; i<forward.length; i++) {
            if(forward[i] != backward[i]) return false;
        }
        return true;
    }
}
