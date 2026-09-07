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
    public void reorderList(ListNode head) {
        if(head.next == null) return;
        ListNode curr = head.next;
        while(head != curr) {
            curr = head.next;
            if(curr.next == null) return;
            while(curr.next.next != null) {
                curr = curr.next;
            }
            ListNode temp = curr.next;
            curr.next = null;
            ListNode temp2 = head.next;
            head.next = temp;
            temp.next = temp2;
            head = head.next.next;
            
        }
        return;
    }
}
