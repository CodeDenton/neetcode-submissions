class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder result = new StringBuilder();
        char[] sChar = s.toCharArray();
        for(char c : sChar) {
            if(Character.isLetterOrDigit(c)) {
                result.append(Character.toLowerCase(c));
            }
        }

        return result.toString().equals(result.reverse().toString());
    }
}
