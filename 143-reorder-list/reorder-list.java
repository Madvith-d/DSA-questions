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
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next ;
        }

        ListNode secondHalfHead = slow.next;
        slow.next = null ;
        ListNode preNode = null;
        ListNode current = secondHalfHead;
        while(current != null){
            ListNode nextTemp = current.next;
            current.next = preNode ;
            preNode = current;
            current = nextTemp;
        }

         secondHalfHead = preNode;
        ListNode firstHalfHead = head;
        
        while(secondHalfHead != null){
            ListNode firstHalfNext = firstHalfHead.next;
            ListNode seconfHalfNext = secondHalfHead.next;
            firstHalfHead.next = secondHalfHead;
            secondHalfHead.next = firstHalfNext;
            firstHalfHead = firstHalfNext;
            secondHalfHead = seconfHalfNext;
        }

    }
}