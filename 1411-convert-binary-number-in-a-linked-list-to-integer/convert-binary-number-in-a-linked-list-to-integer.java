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
 /*
class Solution {

    private ListNode reverseLL(ListNode head) {
        if(head == null || head.next == null) {
            return head;  // Base case
        }
        ListNode last = reverseLL(head.next); 
        head.next.next = head;
        head.next = null;
        return last; 
    }

    public int getDecimalValue(ListNode head) {
        head = reverseLL(head);
        int result = 0;
        int power = 0;

        while(head != null) {
            if(head.val == 1) {
                result += Math.pow(2, power);
            }
            power++;
            head = head.next;
        }
        return result;
    }
}*/

class Solution {

    public int getDecimalValue(ListNode head) {
        int result = 0;

        while(head != null) {
            result = (result << 1) | head.val; // Multiply result by 2, add current digit
            head = head.next;
        }

        return result;
    }
}
