class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sBuild = new StringBuilder();
        char[] sChar = s.toCharArray();
        for(char c : sChar) {
            if(Character.isLetterOrDigit(c)) {
                sBuild.append(Character.toLowerCase(c));
            }
        }
        return sBuild.toString().equals(sBuild.reverse().toString());
    }
}
