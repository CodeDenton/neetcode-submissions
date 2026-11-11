class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<=edges.length; i++) adj.add(new ArrayList<>());

        for(int[] e : edges) {
            if(dfs(adj, e[0], e[1], new boolean[edges.length+1])) return e;
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        return new int[0];
    }

    public boolean dfs(List<List<Integer>> adj, int curr, int target, boolean[] seen) {
        if(curr == target) return true;
        seen[curr] = true;
        for(int next : adj.get(curr)) {
            if(!seen[next] && dfs(adj, next, target, seen)) return true;
        }
        return false;

    }
}
