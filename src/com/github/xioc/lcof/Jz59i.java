package com.github.xioc.lcof;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author hyldev
 * @date 2020/9/17 15:48
 * <p>
 * 思路：
 * 掌握程度：双端队列方法不懂。暴力求解OK
 * note：
 */
public class Jz59i {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
            return new int[0];
        }
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < res.length; i++) {
            res[i] = maxNum(nums, i, k);
        }
        return res;
    }

    private int maxNum(int[] nums, int start, int k) {
        int max = nums[start];
        for (int i = start + 1; i < start + k; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public int[] maxSlidingWindow2(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        //未形成窗口
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }

        res[0] = deque.peekFirst();
        //形成窗口后
        for (int i = k; i < nums.length; i++) {
            if (deque.peekFirst() == nums[i - k]) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            res[i - k + 1] = deque.peekFirst();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] in = {3, -1, 9, 4, 5, 2, 9, 6, 5, 12};
        int[] res = new Jz59i().maxSlidingWindow(in, 9);
        System.out.println(Arrays.toString(res));
    }
}
