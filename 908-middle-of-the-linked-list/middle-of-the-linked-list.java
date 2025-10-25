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
    public ListNode middleNode(ListNode head) {
        int size = Listsize(head);
        int c = 0;
        if(size==1) return head;
        while(head!=null){
            c+=1;
            if(c == (size/2))
            {
                return head.next;
            }
            head = head.next;
        }
        return head;
    }
    private int Listsize (ListNode head){
        int c = 0;
        while(head!=null){
            c+= 1;
            head =head.next;

        }
        return c ;
    }
}