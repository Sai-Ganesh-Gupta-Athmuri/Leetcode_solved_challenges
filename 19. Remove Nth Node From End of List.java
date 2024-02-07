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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = head;
        int c = 1;
        while(start.next != null){
            c++;
            start = start.next;
        }
        if(n>c) return head;
        int index = c - n;
        if(n == 1 && c == 1){
            return null;
        }
        else if(n == c){
            return head.next;
        }
        else if(n == 1){
            ListNode temp1 = head;
            int c1 = 0;
            while(temp1.next.next!=null) {
                temp1 = temp1.next;
            }
            temp1.next = null;
            return head;
        }
        else if(n == 2){
            ListNode temp2 = head;
            while(temp2.next.next.next!=null){
                temp2 = temp2.next;
            }
            temp2.next = temp2.next.next;
            return head;
        }else if(n == c-1){
            head.next = head.next.next;
            return head;
        }
        else{
            ListNode temp = head;
            int c1 = 0;
            while(temp.next!= null){
                temp = temp.next;
                c1 ++;
                if(c1 == index-1){
                    temp.next = temp.next.next;
                    return head;
                }
            }
        }
        return head;
    }
}
