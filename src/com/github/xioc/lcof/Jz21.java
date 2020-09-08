package com.github.xioc.lcof;

/**
 * @author huyanglin
 * @create 2020/8/27 10:02 下午
 */
public class Jz21 {
    public int[] exchange(int[] nums) {
        int[] res = new int[nums.length];
        int head = 0;
        int rear = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & 1) == 1) {
                //奇数
                res[head] = nums[i];
                head++;
            } else {
                //偶数
                res[rear] = nums[i];
                rear--;
            }
        }
        return res;
    }

    public int[] exchange1(int[] nums) {
        int head = 0, rear = nums.length - 1, tmp;
        while (head < rear) {
            while (head < rear && (nums[head] & 1) == 1) {
                head++;
            }
            while (head < rear && (nums[rear] & 1) == 0) {
                rear--;
            }
            tmp = nums[head];
            nums[head] = nums[rear];
            nums[rear] = tmp;
        }
        return nums;
    }
}
