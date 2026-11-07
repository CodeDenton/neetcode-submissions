class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] result = new int[numCourses];

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

        int count = 0;
        while(!queue.isEmpty()) {
            int curr = queue.poll();
            result[count++] = curr;
            for(int next : adj.get(curr)) {
                if(--preReqs[next] == 0) queue.offer(next);
            }
        }
        return count == numCourses ? result : new int[0];
    }
}
