class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer> result = new ArrayList<>();
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        // if(numCourses == 0) return new int[]{};
        int[] preReqs = new int[numCourses];
        for(int[] p : prerequisites) {
            adj.get(p[1]).add(p[0]);
            preReqs[p[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<numCourses; i++) {
            if(preReqs[i] == 0) {
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()) {
            int curr = queue.poll();
            result.add(curr);
            for(int next : adj.get(curr)) {
                preReqs[next]--;
                if(preReqs[next] == 0) queue.offer(next);
            }
        }
        if(result.size() != numCourses) return new int[] {};
        int[] res = new int[numCourses];
        for(int i=0; i<result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }
}
