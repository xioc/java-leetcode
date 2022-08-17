package com.github.xioc.problems;

import com.github.xioc.basic.ListNode;

/**
 * @author: hyl
 * @time: 2022/08/17 09:18:12
 * @description:
 */
public class Main21 {
    public ListNode mergeTwoListNode(ListNode node1, ListNode node2) {
        ListNode head = new ListNode(0);
        ListNode result = head;
        while (node1 != null && node2 != null) {
            ListNode t = null;
            if (node1.val >= node2.val) {
                t = new ListNode(node2.val);
                node2 = node2.next;
            } else {
                t = new ListNode(node1.val);
                node1 = node1.next;
            }
            head.next = t;
            head = head.next;
        }
        if (node1 != null) {
            head.next = node1;
        }
        if (node2 != null) {
            head.next = node2;
        }
        return result.next;
    }

    public static ListNode createListNode(int... val) {
        ListNode head = new ListNode(-1);
        ListNode result = head;
        for (int i : val) {
            ListNode t = new ListNode(i);
            head.next = t;
            head = head.next;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode node1 = createListNode(1, 2, 4);
        ListNode node2 = createListNode(1, 3, 4);
        ListNode listNode = new Main21().mergeTwoListNode(node1, node2);
        int u = 0;
    }
}
