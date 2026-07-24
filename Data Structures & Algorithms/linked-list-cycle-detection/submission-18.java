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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> nodesSet = new HashSet<>();

        while(head != null) {
            if(nodesSet.contains(head)) return true;
            nodesSet.add(head);
            head = head.next;
        }
        return false;
    }
}
