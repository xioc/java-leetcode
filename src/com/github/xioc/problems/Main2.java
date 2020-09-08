package com.github.xioc.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author huyanglin
 * @create 2020/6/4 11:03 下午
 */
public class Main2 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int k = 0; k < nums.length - 2; k++) {
            if (nums[k] > 0) {
                break;
            }
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            int i = k + 1, j = nums.length - 1;
            while (i < j) {
                int sum = nums[k] + nums[i] + nums[j];
                if (sum < 0) {
                    //i+=1 跳过重复
                    while (i < j && nums[i] == nums[++i]) {
                    }
                }
                if (sum > 0) {
                    //j-=1 跳过重复
                    while (i < j && nums[j] == nums[--j]) {
                    }
                }
                if (sum == 0) {
                    result.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    //移动i+=1 j-=1并跳过重复
                    while (i < j && nums[i] == nums[++i]) {
                    }
                    while (i < j && nums[j] == nums[--j]) {
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //nums = [-1, 0, 1, 2, -1, -4]，
        int[] nums = {-1, 0, 1, 2, -1, 4};
        //[-1, 0, 1],
        //  [-1, -1, 2]
        List<List<Integer>> lists = threeSum(nums);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }
}
