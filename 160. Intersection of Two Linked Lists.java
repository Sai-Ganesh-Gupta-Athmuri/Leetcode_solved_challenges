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
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        if(head1 == null || head2 == null) return null;
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        int c1 = 1, c2 = 1;
        while(temp1.next != null){
            temp1 = temp1.next;
            c1++;
        }
        while(temp2.next != null){
            temp2 = temp2.next;
            c2++;
        }
        int diff = Math.abs(c1 - c2);
        if(c1 == 1 && c2 == 1){
            if(head1 == head2) return head1;
            else return null;
        }
        if(c1 > c2){
            int c = 0;
            ListNode temp = head1;
            while(c<diff){
                temp = temp.next;
                c++;
            }
            while(temp!=null){
                if(temp == head2) return temp;
                else{
                    temp = temp.next;
                    head2 = head2.next;
                }
            }
            return null;
        }else{
            int c = 0;
            ListNode temp = head2;
            while(c<diff){
                temp = temp.next;
                c++;
            }
            while(temp!=null){
                if(temp == head1) return temp;
                else{
                    temp = temp.next;
                    head1 = head1.next;
                }
            }
            return null;
        }
    }
}
