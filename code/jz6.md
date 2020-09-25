## 从尾到头打印链表  
## 题目链接
[传送门](https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/)
## 代码
```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        ListNode newL=head;
        int i=0;
        if (head != null) {
            i++;
            while(head.next!=null){
                i++;
                head=head.next;
            }
        }
        int[] nodes=new int[i];
        int j=i-1;
        while(newL!=null){
            nodes[j]=newL.val;
            newL=newL.next;
            j--;
        }
        return nodes;
    }
}
```
## 笔记