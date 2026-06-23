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
        int index = -1;
        ListNode curr = head;
        HashSet<ListNode> nodes = new HashSet<>();
        while(curr != null) {
            index++;
            if(nodes.contains(curr)) {
                return true;
            }
            nodes.add(curr);
            curr = curr.next;
        }
        index = -1;
        return false;
    }
}
