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

    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> a = new HashSet<>();
        for(int i : nums) a.add(i);
        while(head != null){
            if(a.contains(head.val)) head = head.next;
            else break;
        }
        if(head == null || head.next == null) return head;
        ListNode temp = head.next;
        ListNode prev = head;
        while(temp != null){
            if(a.contains(temp.val)) {
                prev.next = temp.next;
                temp = temp.next;
            }else{
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }
}
