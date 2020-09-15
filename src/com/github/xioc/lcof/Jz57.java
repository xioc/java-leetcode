package com.github.xioc.lcof;

/**
 * @author hyldev
 * @date 2020/9/15 19:56
 * <p>
 * 思路：
 * 1.暴力解法，超时
 * 2.双指针，通过
 * 掌握程度：3次提交，学习思路，成功运行
 * note：
 */
public class Jz57 {
    /**
     * 暴力求解 超时
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (target - nums[i] == nums[j]) {
                    res[0] = nums[i];
                    res[1] = nums[j];
                    break;
                }
            }
        }
        return res;
    }

    public int[] twoSum2(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum > target) {
                end--;
            }
            if (sum < target) {
                start++;
            }
            if (sum == target) {
                return new int[]{nums[start], nums[end]};
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] in = {0, 1, 3, 5, 6, 7, 8, 9, 10};
        new Jz57().twoSum(in, 6);
    }
}
