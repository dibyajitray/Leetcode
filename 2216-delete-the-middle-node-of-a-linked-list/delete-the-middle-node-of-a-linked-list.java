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
    public ListNode deleteMiddle(ListNode head) {
        ListNode prevSlow = null;
        ListNode slow = head;
        ListNode fast = head;
        
        // Use the two-pointer (tortoise and hare) algorithm to find the middle node.
        while (fast != null && fast.next != null) {
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }  
        // This condition handles the edge case of a list with only one node.
        if (prevSlow == null) {
            return null;
        }
        
        // Unlink the middle node 
        prevSlow.next = slow.next;   
        return head;
    }
}