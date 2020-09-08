package com.github.xioc.lcof;

import com.github.xioc.basic.ListNode;

/**
 * @author huyanglin
 * @create 2020/8/30 5:07 下午
 */
public class Jz25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode res = node;

        while (l1 != null && l2 != null) {
            ListNode tmp = null;
            if (l1.val < l2.val) {
                //l1小
                tmp = new ListNode(l1.val);
                l1 = l1.next;

            } else {
                tmp = new ListNode(l2.val);
                l2 = l2.next;
            }
            node.next = tmp;
            node = node.next;
        }
        if (l1 != null) {
            node.next = l1;
        }
        if (l2 != null) {
            node.next = l2;
        }
        return res.next;
    }
}
