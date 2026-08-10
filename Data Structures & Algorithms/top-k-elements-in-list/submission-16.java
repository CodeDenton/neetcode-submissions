class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        //add all freq to Map
        for(int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // minHeap add freq
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a,b) -> count.get(a) - count.get(b)
        );
        
        for(int n : count.keySet()) {
            minHeap.offer(n);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k];
        for(int i=0; i<k; i++) {
            result[i] = minHeap.poll();
        }
        return result;
    }
}
