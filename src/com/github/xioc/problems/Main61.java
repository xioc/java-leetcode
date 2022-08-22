package com.github.xioc.problems;

import com.github.xioc.basic.ListNode;
import com.github.xioc.basic.ListNodeUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: hyl
 * @time: 2022/08/17 09:33:16
 * @description:
 */
public class Main61 {
    /**
     * 旋转单链表 右移k
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        int length = 0;
        ListNode t = head;
        List<ListNode> array = new ArrayList<>();
        while (t != null) {
            length++;
            t = t.next;
        }
        k = k % length;
        return null;
    }

    public static void main(String[] args) {
        ListNode node = ListNodeUtils.createListNode(1, 2, 3, 4, 5, 9, 67);
        ListNode listNode = new Main61().rotateRight(node, 2);
        int u = 0;
    }
}
