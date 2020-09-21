package com.github.xioc.problems;


/**
 * @author hyldev
 * @date 2020/9/21 18:49
 * <p>
 * 思路：双指针
 * 掌握程度
 * note:
 */
public class Main88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;
        while ((p1 >= 0) && (p2 >= 0)) {
            nums1[p--] = (nums1[p1] > nums2[p2]) ? nums1[p1--] : nums2[p2--];
        }
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}
