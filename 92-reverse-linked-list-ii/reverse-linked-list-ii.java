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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode prev = null;
        ListNode current = head;

        for (int i = 1; i < left; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode tail = current;

        ListNode next = null;
        for (int i = 0; i <= right - left; i++) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;  
        }

        tail.next = current; 

        return head;
    }
}
