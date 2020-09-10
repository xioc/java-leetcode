package com.github.xioc.problems;

import com.github.xioc.basic.ListNode;

import java.util.Stack;

/**
 * @author hyldev
 * @create 2020/6/7 10:36 下午
 */
public class Main25 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode listNode = new Main25().reverseKGroup(node1, 3);
        while (listNode != null) {
            System.out.print(listNode.val + "->");
            listNode = listNode.next;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int count = 0;
        ListNode result = new ListNode(0);
        ListNode copyResult = result;
        Stack<ListNode> stack = new Stack<>();
        Stack<ListNode> viceStack = new Stack<>();
        while (head != null) {
            while (head != null && count < k) {
                stack.push(head);
                head = head.next;
                count++;
            }
            if (count == k) {
                while (!stack.isEmpty()) {
                    ListNode listNode = stack.pop();
                    listNode.next = null;
                    copyResult.next = listNode;
                    copyResult = copyResult.next;
                }
            } else {
                while (!stack.isEmpty()) {
                    viceStack.push(stack.pop());
                }
                while (!viceStack.isEmpty()){
                    ListNode listNode = viceStack.pop();
                    listNode.next = null;
                    copyResult.next = listNode;
                    copyResult = copyResult.next;
                }
            }

            count = 0;
        }
        return result.next;
    }
}
