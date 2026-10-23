class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // hash map
        // pri queue

        Map<Integer, Integer> prevMap = new HashMap<>();
        for(int n : nums) {
            prevMap.put(n, prevMap.getOrDefault(n,0)+1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a,b) -> prevMap.get(a) - prevMap.get(b)
        );

        for(int n : prevMap.keySet()) {
            minHeap.offer(n);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k];
        for(int i=0; i < k; i++) {
            result[i] = minHeap.poll();
        }
        return result;
    }
}
