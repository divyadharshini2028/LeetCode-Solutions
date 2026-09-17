/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        ListNode b=headB;

        while(a!=b){
            if(a==null){
                a=headB;//this is when a is lengther then b and it will continue to blist .so that at any point it will come to null==null ..the loop end.. return null
            }
            else{
                a=a.next;
            }
             if(b==null){
                b=headA;
            }
            else{
                b=b.next;
            }
        }
        return a;
    }
} // TC: O(n + m)  SC: O(1)