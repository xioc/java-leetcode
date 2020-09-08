package com.github.xioc.problems;

import com.github.xioc.basic.ListNode;

import java.util.Stack;

/**
 * @author huyanglin
 * @create 2020/6/5 10:17 下午
 */
public class Main24 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode listNode = new Main24().swapPairs(node1);
        while (listNode != null) {
            System.out.print(listNode.val + " -> ");
            listNode = listNode.next;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        Stack<ListNode> stack = new Stack<>();
        int count = 0;
        ListNode result = new ListNode(0);
        ListNode copyResult = result;
        while (head != null) {
            while (head != null && count < 2) {
                stack.push(head);
                head = head.next;
                count++;
            }
            while (!stack.isEmpty()) {
                ListNode tmp = stack.pop();
                tmp.next = null;
                copyResult.next = tmp;
                copyResult = copyResult.next;
            }
            count = 0;
        }
        return result.next;
    }
}
