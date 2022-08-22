package com.github.xioc.basic;

/**
 * @author: hyl
 * @time: 2022/08/17 09:33:51
 * @description:
 */
public class ListNodeUtils {
    public static ListNode createListNode(int... val) {
        ListNode head = new ListNode(0);
        ListNode result = head;
        for (int i : val) {
            ListNode t = new ListNode(i);
            head.next = t;
            head = head.next;
        }
        return result.next;
    }
}
