package com.github.xioc.lcof;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author hyldev
 * @date 2020/9/17 15:48
 * <p>
 * 思路：
 * 1.暴力求解
 * 2.使用双端单调队列
 * 掌握程度：思想掌握，代码多次提交
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
        int[] in = {1, 9, 10, -3, 5, 3, 6, 7};
        int[] res = new Jz59i().maxSlidingWindow3(in, 3);
        System.out.println(Arrays.toString(res));
    }

    public int[] maxSlidingWindow3(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        //没有形成窗口
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }
        res[0] = deque.peekFirst();
        //已经形成窗口
        for (int i = k; i < nums.length; i++) {
            //先清除队头元素，保证窗口大小最大为K
            //必须要清除超出范围的元素
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
}
