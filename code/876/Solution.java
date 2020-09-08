/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//解法1 使用快慢指针
class Solution {
    public ListNode middleNode(ListNode head) {
		ListNode fast=head;
        ListNode slow =head;
        while (fast!=null){
            if(fast.next==null){
                return slow;
            }
            if(fast.next!=null && fast.next.next==null){
                return slow.next;
            }
            fast=fast.next.next;
            slow=slow.next;

        }
        return null;
	}
}
//解法2 数组法
public ListNode middleNode2(ListNode head) {
	ListNode[] listNodes=new ListNode[100];
	int i=0;
	while (head!=null){
		listNodes[i]=head;
		head=head.next;
		i++;
	}
	return listNodes[i/2];
}