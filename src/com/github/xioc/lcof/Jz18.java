package com.github.xioc.lcof;

import com.github.xioc.basic.ListNode;

/**
 * @author huyanglin
 * @create 2020/8/26 11:00 下午
 */
public class Jz18 {
    /**
     * 删除单链表中值为val的节点，返回头节点
     *
     * @param head
     * @param val
     * @return
     */
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) {
            return head.next;
        }
        ListNode pre = head, cur = head.next;
        while (cur.next != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        if (cur != null) {
            pre.next = cur.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode listNode = new Jz18().deleteNode(node1, 8);
        listNode.printVal();
    }
}
