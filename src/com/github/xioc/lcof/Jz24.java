package com.github.xioc.lcof;

import com.github.xioc.basic.ListNode;

/**
 * @author huyanglin
 * @create 2020/8/30 4:58 下午
 */
public class Jz24 {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode res = new ListNode(0);
        //尾插法建表
        while (head != null) {
            ListNode tmp = new ListNode(head.val);
            tmp.next = res.next;
            res.next = tmp;
            head = head.next;
        }
        return res.next;
    }
}
