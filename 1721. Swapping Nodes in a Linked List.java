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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null) return null;
        ListNode temp = head;
        ListNode temp1 = head;
        ListNode temp2 = head;
        int c = 1;
        while(temp != null){
            if(c==k){
                temp1 = temp;
            }
            if(c>k){
                temp2 = temp2.next;
                temp = temp.next;
                c++;
            }else{
                temp = temp.next;
                c++;
            }
        }
        int t = temp1.val;
        temp1.val = temp2.val;
        temp2.val = t;
        return head;
    }
}
