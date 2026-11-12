class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //bfs
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<numCourses; i++) adj.add(new ArrayList<>());

        int[] preReqs = new int[numCourses];
        for(int[] p : prerequisites) {
            adj.get(p[1]).add(p[0]);
            preReqs[p[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<numCourses; i++) {
            if(preReqs[i] == 0) queue.offer(i);
        }
        List<Integer> result = new ArrayList<>();
        while(!queue.isEmpty()) {
            int course = queue.poll();
            result.add(course);
            for(int next : adj.get(course)) {
                preReqs[next]--;
                if(preReqs[next] == 0) queue.offer(next);
            }
        }
        if(result.size() != numCourses) return new int[0];
        int[] res = new int[result.size()];
        for(int i=0; i<numCourses; i++) {
            res[i] = result.get(i);
        }
        return res;
    }
}
