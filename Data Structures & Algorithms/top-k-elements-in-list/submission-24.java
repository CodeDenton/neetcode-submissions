class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0)+1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a,b) -> freqMap.get(a) - freqMap.get(b)
        );

        for(int key : freqMap.keySet()) {
            minHeap.offer(key);
            if(minHeap.size() > k) minHeap.poll();
        }

        int[] result = new int[k];
        for(int i=0; i<k; i++) {
            result[i] = minHeap.poll();
        }
        return result;
    }
}
