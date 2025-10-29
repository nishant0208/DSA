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
     ListNode res = new ListNode(0);
        ListNode temp = res;

        int carry  = 0;
        while ( l1!= null || l2!= null || carry !=0){
            int sum =0;

            if(l1!=null){
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if(l2!= null) {
                sum = sum + l2.val;
                l2=l2.next;
            }
            if( carry >0) {
                sum = sum + 1;
                carry = 0;
            }
            if(sum >=10)
            {
                sum = sum % 10;
                carry = 1;
            }
            ListNode newNode = new ListNode(sum) ;
            temp.next = newNode;
            temp = temp.next;


        }
        return res.next;
    }
}