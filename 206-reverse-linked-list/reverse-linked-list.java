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
        ListNode curr=head;
        ListNode prev=null;

        while(curr!=null){//cur==1 // 2 // 3 // null
            ListNode next=curr.next; // 1->2 // 2->3 // 3->null
            curr.next=prev; // 1 null // 2 1 // 3 2
            prev=curr;// null->1 // 1->2 // 2->3
            curr=next;// 1->2 // 2->3 // 3->null
        }
        return prev;       
    }
}//Time Complexity: O(n)  Space Complexity: O(1)