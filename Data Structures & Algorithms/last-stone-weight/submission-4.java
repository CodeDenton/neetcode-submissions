class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        //put stones into minHeap, - to make max heap b/c heaviest
        for(int s : stones) {
            minHeap.offer(-s);
        }

        while(minHeap.size() > 1) {
            int first = minHeap.poll();
            int second = minHeap.poll();
            if(first < second) {
                minHeap.offer(first - second); // opp b/c negative
            }
        }
        minHeap.offer(0);
        return Math.abs(minHeap.peek());
    }
}
