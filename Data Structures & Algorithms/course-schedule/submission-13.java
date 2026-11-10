class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] p : prerequisites) {
            // adj.get(p[0]).add(p[1]);
            adj.get(p[1]).add(p[0]);
        }

        int[] state = new int[numCourses];

        for(int i=0; i<numCourses; i++) {
            if(dfs(i, state, adj)) return false;
        }
        return true;
    }

    public boolean dfs(int course, int[] state, List<List<Integer>> adj) {
        if(state[course] == 1) return true;
        if(state[course] == 2) return false;

        state[course] = 1;
        for(int next : adj.get(course)) {
            if(dfs(next, state, adj)) return true;
        }
        state[course] = 2;
        return false;
    }
}
