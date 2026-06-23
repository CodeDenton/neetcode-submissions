class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for(char c : s.toCharArray()) {
            list.add(c);
        }
        for(int i=0; i<list.size()-1; i++) {
            if(list.get(i) == '(' && list.get(i+1) == ')') {
                list.remove(i+1);
                list.remove(i);
                i = -1;
            } else if(list.get(i) == '{' && list.get(i+1) == '}') {
                list.remove(i+1);
                list.remove(i);
                i = -1;
            } else if(list.get(i) == '[' && list.get(i+1) == ']') {
                list.remove(i+1);
                list.remove(i);
                i = -1;
            }
        }
        System.out.println(list.size());
        if(list.size() == 0) return true;
        return false;
    }
}
