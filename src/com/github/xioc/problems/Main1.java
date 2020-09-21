package com.github.xioc.problems;

import java.util.Arrays;

/**
 * @author hyldev
 * @date 2020/9/21 16:06
 */
public class Main1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((target - nums[i] == nums[j]) && (i != j)) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] in = {1, 3, 5, 7, 9, 15, 20};
        int[] ints = new Main1().twoSum(in, 12);
        System.out.println(Arrays.toString(ints));
    }
}
