class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // HashMap and Heap(pri queue)
        Map<Integer, Integer> count = new HashMap<>();
        for(int n : nums) {
            count.put(n, count.getOrDefault(n,0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a,b) -> count.get(a) - count.get(b)
        );
        for(int n : count.keySet()) {
            minHeap.offer(n);
        }

        while(minHeap.size() > k) {
            minHeap.poll();
        }
        
        int[] result = new int[k];
        for(int i=0; i<k; i++) {
            result[i] = minHeap.poll();
        }
        return result;
    }
}
