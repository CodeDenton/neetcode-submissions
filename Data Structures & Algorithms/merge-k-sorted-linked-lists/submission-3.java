/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(
            (a,b) -> a.val - b.val
        );
        for(ListNode l : lists) {
            if(l != null) minHeap.offer(l);
        }

        while(!minHeap.isEmpty()) {
            ListNode curr = minHeap.poll();
            current.next = curr;
            current = current.next;
            if(curr.next != null) minHeap.offer(curr.next);
        }
        return dummy.next;
    }
}
