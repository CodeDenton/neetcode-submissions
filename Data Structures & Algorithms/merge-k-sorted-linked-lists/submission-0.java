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

        PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>(
            (a,b) -> a.val - b.val
        );

        for(ListNode l : lists) {
            while(l != null) {
                minHeap.offer(l);
                l = l.next;
            }
        }

        ListNode x = new ListNode();
        ListNode head = new ListNode();

        if(minHeap.size() > 0) {
            ListNode temp = minHeap.poll();
            x = temp;
            head = temp;
        } else {
            return null;
        }

        while(minHeap.size() > 0) {
            x.next = minHeap.poll();
            x = x.next;
        }

        return head;
    }
}
