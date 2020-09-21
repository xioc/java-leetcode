package com.github.xioc.problems;

import com.github.xioc.basic.ListNode;

/**
 * @author hyldev
 * @date 2020/9/21 11:23
 */
public class Main83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
