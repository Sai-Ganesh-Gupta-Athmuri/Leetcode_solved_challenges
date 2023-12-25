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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode newNode = null;
        int carry = 0;
        ListNode prev = null;
        ListNode head = null;
        while(node1 != null && node2 != null){
            int n = node1.val + node2.val+carry;
            newNode = new ListNode(n%10);
            carry = n/10;
            if(prev == null){
                prev = newNode;
                head = prev;
            }else{
                prev.next = newNode;
                prev = newNode;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        while(node1!=null){
            int n = node1.val + carry;
            newNode = new ListNode(n%10);
            carry = n/10;
            if(prev == null){
                prev = newNode;
                head = prev;
            }else{
                prev.next = newNode;
                prev = newNode;
            }
            node1 = node1.next;
        }
        while(node2!=null){
            int n = node2.val + carry;
            newNode = new ListNode(n%10);
            carry = n/10;
            if(prev == null){
                prev = newNode;
                head = prev;
            }else{
                prev.next = newNode;
                prev = newNode;
            }
            node2 = node2.next;
        }
        if(carry!=0){
            newNode = new ListNode(carry);
            prev.next = newNode;
        }
        return head;
    }
}
