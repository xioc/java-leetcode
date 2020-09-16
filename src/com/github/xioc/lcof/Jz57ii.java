package com.github.xioc.lcof;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hyldev
 * @date 2020/9/15 20:53
 *
 * 思路：双指针
 * 掌握程度：看题解思路，自己代码实现
 * note：
 */
public class Jz57ii {
    List<int[]> res = new ArrayList<>();

    public int[][] findContinuousSequence(int target) {

        int start = 1, end = 2;
        int sum = 0;
        while (start < end) {
            sum = ((end + start) * (end - start + 1)) >> 1;
            if (sum < target) {
                end++;
            } else if (sum > target) {
                start++;
            } else {
                res.add(generateList(start, end));
                start++;
            }

        }
        return toArray(res);
    }

    private int[][] toArray(List<int[]> data) {
        int[][] res = new int[data.size()][];
        for (int i = 0; i < data.size(); i++) {
            res[i] = data.get(i);
        }
        return res;
    }


    private int[] generateList(int start, int end) {
        int[] tmp = new int[end - start + 1];
        int index = 0;
        for (int i = start; i <= end; i++) {
            tmp[index] = i;
            index++;
        }
        return tmp;
    }

    public static void main(String[] args) {
        new Jz57ii().findContinuousSequence(25);
    }
}
