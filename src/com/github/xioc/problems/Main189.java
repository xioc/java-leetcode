package com.github.xioc.problems;

/**
 * @author huyanglin
 * @create 2020/6/8 4:53 下午
 */
public class Main189 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        new Main189().rotate(nums, 3);
        System.out.println("2 - 3 - 4 - 0 - 1");
        for (int num : nums) {
            System.out.print(num + " - ");
        }
    }

    public void rotate(int[] nums, int k) {
        int l = nums.length;
        k = k % l;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < l; j++) {
                int tmp = nums[j];
                nums[j] = nums[l - 1];
                nums[l - 1] = tmp;

            }
        }
    }
}
