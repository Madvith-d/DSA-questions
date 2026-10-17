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

/**
    Looking at the reordering pattern, we need to alternate between nodes from the start and nodes from the end of the list. The challenge is that in a singly linked list, we can only traverse forward - we can't easily access nodes from the end.

The key insight is to observe what's happening: we're essentially weaving together two sequences - the first half of the list going forward (L0, L1, L2...) and the second half going backward (Ln, Ln-1, Ln-2...).

If we could somehow have two separate lists - one containing the first half and another containing the second half in reverse order - then we could simply merge them by alternating nodes. This transforms our problem into three simpler subproblems:

Split the list in half: We need to find where to split. Using the fast and slow pointer technique is perfect here - when the fast pointer reaches the end (moving 2 steps at a time), the slow pointer (moving 1 step at a time) will be at the middle.

Reverse the second half: Once we have the second half separated, we need to reverse it so that we can access what were originally the last nodes first. This way, Ln-1 → Ln becomes Ln → Ln-1.

Merge alternately: With the first half as L0 → L1 → L2... and the reversed second half as Ln → Ln-1 → Ln-2..., we can now easily alternate between them to create the desired pattern.

This approach is elegant because it breaks down a complex reordering problem into three well-known, simple operations on linked lists. Each step has O(n) time complexity and uses O(1) extra space, making the entire solution efficient.

 */