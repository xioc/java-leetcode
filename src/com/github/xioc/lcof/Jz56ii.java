package com.github.xioc.lcof;

/**
 * @author hyldev
 * @date 2020/9/15 17:18
 * 思路：位运算
 * 掌握程度：提交5次，参考别人思路
 * note：位运算很强大
 */
public class Jz56ii {
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < 32; i++) {
            //统计出现1的次数，区分3n 或者 3n+1
            int count = 0;
            int index = 1 << i;
            for (int tmp : nums) {
                //该位不为0
                if ((index & tmp) != 0) {
                    count++;
                }
            }
            if (count % 3 == 1) {
                result = (int) ((int) result + Math.pow(2, i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] in = {1, 4, 4, 1, 7, 4, 1, 7, 7, 9};
        System.out.println(new Jz56ii().singleNumber(in));
    }
}
