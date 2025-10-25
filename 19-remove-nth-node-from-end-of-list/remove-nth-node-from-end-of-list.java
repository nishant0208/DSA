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
        ListNode curr = head;
        int c = 0;
        int size = countLen(head);
        if(size == 0){
            return head =null;
        }
        
        while(curr!=null){
            c+=1;
            if(n==1 && c==size+1){
                curr.next = null;
                return head;
            }
            if(size-n+1 == 0){
               head = head.next;
               return head;
            }
            if(size-n+1 == c){
                curr.next= curr.next.next;
            }
            curr = curr.next;
        }
        return head ;
    }
    private static int countLen(ListNode head){
        int c = 0;
        while(head!=null){
            c++;
            head=head.next;
        }
        
        return c-1;
    }
}