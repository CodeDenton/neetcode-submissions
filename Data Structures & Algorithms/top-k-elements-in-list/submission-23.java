class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //hash map
        //priority queue

        HashMap<Integer, Integer> prevMap = new HashMap<>();
        for(int n : nums) {
            prevMap.put(n, prevMap.getOrDefault(n, 0)+1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a,b) -> prevMap.get(a) - prevMap.get(b)
        );

        for(int key : prevMap.keySet()) {
            minHeap.offer(key);
            while(minHeap.size() > k) minHeap.poll();
        }

        int[] result = new int[k];
        for(int i=0; i<k; i++) {
            result[i] = minHeap.poll();
        }

        return result;


    }
}
