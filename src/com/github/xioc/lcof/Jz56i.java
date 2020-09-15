package com.github.xioc.lcof;

import java.util.*;

/**
 * @author hyldev
 * @date 2020/9/15 11:00
 * <p>
 * 思路：
 * 1.遍历数组，利用Map存储，效率低下
 * 2.使用Set去重
 * 3.最优解法：使用异或的性质求解 a^a=0 a^0=a
 * 掌握程度：提交5次
 * note： 异或的性质，找出一个数最低位为1的数字：sum & (-sum)
 */
public class Jz56i {
    public int[] singleNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.keySet().contains(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }

        }
        int[] res = new int[2];
        int index = 0;
        Integer[] keys = map.keySet().toArray(new Integer[map.size()]);
        for (int i = 0; i < keys.length; i++) {
            if (map.get(keys[i]) == 1) {
                res[index] = keys[i];
                index++;
            }
            if (index >= 2) {
                break;
            }
        }
        return res;


    }

    public int[] singleNumbers2(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                //set中已经出现了
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }

        }
        int[] res = new int[2];
        List<Integer> list = new ArrayList<>(set);
        res[0] = list.get(0);
        res[1] = list.get(1);
        return res;
    }

    public int[] singleNumbers3(int[] nums) {
        int sum = 0;
        int[] res = new int[2];
        for (int tmp : nums) {
            sum = sum ^ tmp;
        }

        // !!! 找出sum最低位为1代表的数字
        int lowBit = sum & (-sum);
        for (int num : nums) {
            if ((num & lowBit) == 0) {
                res[0] = res[0] ^ num;
            } else {
                res[1] = res[1] ^ num;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] in = {1, 4, 4, 6, 8, 6, 8, 9};
        new Jz56i().singleNumbers3(in);
    }
}
