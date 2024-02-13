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
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        ListNode temp = head;
        ListNode tail = head;
        int c = 1;
        while(temp!=null){
            tail = temp;
            temp = temp.next;
            c++;
        }
        if(c == 1 || c == 2) return head;
        temp = head;
        ListNode prev = null;
        int c1 = 1;
        while(c1<c){
            if(c1 % 2 == 0){
                tail.next = temp;
                prev.next = temp.next;
                tail = temp;
            }
            prev = temp;
            temp = temp.next;
            c1++;
        }
        tail.next = null;
        return head;
    }
}
