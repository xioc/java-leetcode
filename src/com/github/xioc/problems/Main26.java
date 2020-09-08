package com.github.xioc.problems;

/**
 * @author huyanglin
 * @create 2020/6/8 10:00 上午
 */
public class Main26 {
    public static void main(String[] args) {
        //int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums = {0, 0, 1, 1};
        new Main26().removeDuplicates(nums);

    }

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        int flag = nums[0] - 1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] == nums[i - 1]) {
                nums[i] = flag;
                count++;
            }
        }
        //j用来记录位置
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != flag) {
                nums[j] = nums[i];
                j++;
            }
        }
        return nums.length - count;
    }
}