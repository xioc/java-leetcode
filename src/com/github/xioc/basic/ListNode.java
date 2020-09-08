package com.github.xioc.basic;

/**
 * @author huyanglin
 * @create 2020/6/5 10:17 下午
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }


    public void printVal() {
        ListNode head = this;
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
