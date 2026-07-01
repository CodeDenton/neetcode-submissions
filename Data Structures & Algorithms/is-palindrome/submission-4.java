class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sBuild = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                sBuild.append(Character.toLowerCase(c));
            }
        }   
        return sBuild.toString().equals(sBuild.reverse().toString());
    }
}
