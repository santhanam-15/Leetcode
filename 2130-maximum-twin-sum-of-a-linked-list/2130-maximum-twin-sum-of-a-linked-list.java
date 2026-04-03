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
    public int pairSum(ListNode head) {
        int c=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            ++c;
        }
        int n=c;
        c/=2;
        int[] arr=new int[c];
        int max=0;
        curr=head;
        for(int i=0;i<c;i++){
            arr[i]=curr.val;
            curr=curr.next;
        }
        for(int i=c-1;i>=0;i--){
            arr[i]+=curr.val;
            curr=curr.next;
            max=Math.max(max,arr[i]);
        }
        return max;
    }
}