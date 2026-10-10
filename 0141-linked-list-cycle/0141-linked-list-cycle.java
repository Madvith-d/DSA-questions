/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> mp = new HashSet<>();
        if(head == null || head.next == null){
            return false;
        }
        mp.add(head);
        head = head.next;
        while(true){
            if(head == null){
                break;
            }
            if(!mp.contains(head)){
                mp.add(head);
                head = head.next;
            }else{
                return true;
            }
        }

        return false ;
    }
}