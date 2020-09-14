package com.github.xioc.lcof;

/**
 * @author hyldev
 * @date 2020/9/14 19:27
 * <p>
 * 思路：二分查找
 * 掌握程度：提交4次通过
 */
public class Jz53ii {
    public int missingNumber(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (nums[mid] == mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] in = {0, 1, 3};
        System.out.println(new Jz53ii().missingNumber(in));
    }
}
