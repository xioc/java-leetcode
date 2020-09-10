package com.github.xioc.lcof;

import com.github.xioc.basic.ListNode;

/**
 * @author hyldev
 * @create 2020/8/30 3:50 下午
 */
public class Jz22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode res = head;
        ListNode copyHead = head;
        int length = 0;
        while (head != null) {
            head = head.next;
            length++;
        }
        int pre = length - k;
        if (pre == 0) {
            return res.next;
        }
        int index = 0;
        while (copyHead != null) {
            index++;

            if (index == pre) {
                copyHead.next = copyHead.next.next;
            }
            copyHead = copyHead.next;
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        new Jz22().getKthFromEnd(node1, 1).printVal();
    }

    public ListNode getKthFromEnd1(ListNode head, int k) {
        ListNode res = head;
        ListNode copyHead = head;
        int length = 0;
        while (head != null) {
            head = head.next;
            length++;
        }
        int pre = length - k;
        if (pre == 0) {
            return res;
        }
        int index = 0;
        while (copyHead != null) {
            index++;

            if (index == pre) {
                //copyHead.next = copyHead.next.next;
                res = copyHead.next;
                break;
            }
            copyHead = copyHead.next;
        }
        return res;
    }

    public ListNode getKthFromEnd2(ListNode head, int k) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
