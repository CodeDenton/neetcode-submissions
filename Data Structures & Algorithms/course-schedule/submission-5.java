class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for(int[] p : prerequisites) {
            adj.get(p[0]).add(p[1]);
        }
        int[] state = new int[numCourses];
        for(int i=0; i<numCourses; i++) {
            if(hasCycle(i, adj, state)) return false;
        }
        return true;
    }

    public boolean hasCycle(int course, List<List<Integer>> adj, int[] state) {
        if(state[course] == 1) return true;
        if(state[course] == 2) return false;

        state[course] = 1;

        for(int next : adj.get(course)) {
            if(hasCycle(next, adj, state)) return true;
        }
        state[course] = 2;
        return false;
    }
}
