class Solution {

    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        String current = "";
        dfs(n, 0, 0, current);
        return result;
    }

    public void dfs(int n, int open, int close, String current) {
        if(current.length() == n * 2) {
            result.add(current);
            return;
        }

        if(open < n) {
            dfs(n, open+1, close, current + "(");
        }
        if(close < open) {
            dfs(n, open, close+1, current + ")");
        }
    }
}
