package com.github.xioc.lcof;

/**
 * @author hyldev
 * @date 2020/9/14 18:58
 * 统计一个数字在排序数组中出现的次数。
 * 思路：折半查找
 */
public class Jz53i {
    public int search(int[] nums, int target) {
        int index = -1;
        //折半查找
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (nums[mid] == target) {
                index = mid;
                break;
            }
            if (nums[mid] > target) {
                high = mid - 1;
            }
            if (nums[mid] < target) {
                low = mid + 1;
            }
        }
        if (index == -1) {
            return 0;
        }
        int start = index, end = index;
        while (end <= nums.length - 2 && nums[end] == nums[end + 1]) {
            end++;
        }
        while (start >= 1 && nums[start] == nums[start - 1]) {
            start--;
        }
        return end - start + 1;
    }

    public static void main(String[] args) {
        int[] input = {1, 4, 5, 6, 7, 9, 15};
        System.out.println(new Jz53i().search(input, 9));
    }
}
