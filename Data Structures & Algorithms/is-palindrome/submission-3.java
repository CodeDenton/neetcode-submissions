class Solution {
    public boolean isPalindrome(String s) {
        String t = s;
        t = reverse(t);
        s = forward(s);
        s = s.toLowerCase();
        t = t.toLowerCase();
        System.out.println(s);
        System.out.println(t);

        if(s.equals(t)) return true;
        else return false;
    }

    public String reverse(String t) {
        String temp = "";
        for(int i=t.length()-1; i>=0; i--) {
            if(Character.isLetterOrDigit(t.charAt(i))) {
                temp += t.charAt(i);
            }
        }
        return temp;
    }

    public String forward(String s) {
        String temp = "";
        for(int i=0; i<s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                temp += s.charAt(i);
            }
        }
        return temp;
    }
}
