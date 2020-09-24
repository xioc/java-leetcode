package com.github.xioc.problems;

import com.github.xioc.basic.ListNode;

/**
 * @author hyldev
 * @create 2020/6/5 10:42 下午
 * <p>
 * 思路：如果链表有环，则快慢指针一定会相遇
 * note：使用双指针
 * 掌握程度：学习思路，自己写代码
 */
public class Main141 {
    /**
     * 判断链表是否有环
     *
     * @param head
     * @return
     */
    public boolean hasCycle2(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head, fast = head.next;
        while (slow != null && fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
