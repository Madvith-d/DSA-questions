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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        } 
        if(head.next == null){
            return head;
        }
        ListNode newHead = rev(head) ;
        return newHead;
    }

    public ListNode rev(ListNode node){
        if(node.next == null){
            return node ;
        }

        ListNode newHead = rev(node.next);
        node.next.next = node;
        node.next = null ;
        return newHead ;
    }
}