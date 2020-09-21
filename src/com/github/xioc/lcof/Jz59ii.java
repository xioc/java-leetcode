package com.github.xioc.lcof;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hyldev
 * @date 2020/9/18 11:21
 * <p>
 * 来源：https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof/
 * 思路：
 * 掌握程度：
 * note：
 */
public class Jz59ii {
    List<Integer> data;
    int max;

    public Jz59ii() {
        data = new ArrayList<>();
        max = Integer.MIN_VALUE;
    }

    public int max_value() {
        if (data.size() == 0) {
            return -1;
        }
        return max;
    }

    /**
     * 进队
     *
     * @param value
     */
    public void push_back(int value) {
        data.add(value);
        if (value > max) {
            max = value;
        }
    }

    /**
     * 出队
     *
     * @return
     */
    public int pop_front() {
        if (data.size() == 0) {
            return -1;
        }
        int res = data.get(0);
        data.remove(0);
        return res;
    }
}
