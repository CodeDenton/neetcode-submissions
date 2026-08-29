class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a,b) -> count.get(a) - count.get(b)
        );

        for(int n : count.keySet()) {
            minHeap.add(n);
        }

        int[] result = new int[k];

        for(int i=0; i < result.length; i++) {
             while(minHeap.size() > k) {
                minHeap.poll();
            }
            result[i] = minHeap.poll();
        }
       return result;
    }
}
