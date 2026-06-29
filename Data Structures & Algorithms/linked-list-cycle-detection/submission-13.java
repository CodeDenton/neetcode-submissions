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
        ListNode curr = head;
        HashSet<ListNode> mySet = new HashSet<>();
        while(curr != null) {
            if(mySet.contains(curr)) return true;
            mySet.add(curr);
            // System.out.println(mySet);
            curr = curr.next;
        }
        return false;
    }
}
