package com.github.xioc.problems;

import com.github.xioc.basic.ListNode;

/**
 * @author hyldev
 * @create 2020/8/31 9:49 上午
 */
public class Main160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode node1 = headA;
        ListNode node2 = headB;
        while (node1 != node2) {
            node1 = (node1 == null ? headB : node1.next);
            node2 = (node2 == null ? headA : node2.next);
        }
        return node1;
    }
}
