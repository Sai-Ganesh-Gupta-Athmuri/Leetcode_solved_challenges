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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        ListNode i = list1;
        ListNode j = list2;
        while(i!=null && j!=null){
            if(i.val < j.val){
                head.next = new ListNode(i.val);
                i = i.next;
                head = head.next;
            }else{
                head.next = new ListNode(j.val);
                j = j.next;
                head = head.next;
            }
        }
        while(i!=null){
            head.next = new ListNode(i.val);
            i = i.next;
            head = head.next;
        }
        while(j!=null){
            head.next = new ListNode(j.val);
            j = j.next;
            head = head.next;
        }
        return temp.next;
    }
}
