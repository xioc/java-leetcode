package com.github.xioc.sort;

import java.util.Arrays;

/**
 * 冒泡排序Java实现
 *
 * @author hyldev
 * @date 2020/9/7 15:31
 */
public class BubbleSort {
    /**
     * 冒泡排序Java实现
     *
     * @param arr 待排序数组
     * @return 排序后的结果
     */
    public static int[] bubbleSort(int[] arr) {
        //控制冒泡的趟数
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
            //System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] in = {1, 8, 4, 5, 3};
        bubbleSort(in);
    }
}
