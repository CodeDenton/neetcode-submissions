class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // construct heap
        for(int s : stones) {
            minHeap.offer(-s); // - to make maxHeap
        }

        while(minHeap.size() > 1) {
            int first = minHeap.poll();
            int second = minHeap.poll();
            if (second > first) {
                minHeap.offer(first - second);
            }
        }

        minHeap.offer(0);
        return Math.abs(minHeap.peek());

    }
}
