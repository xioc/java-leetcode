package com.github.xioc.sort;

import java.util.Arrays;

/**
 * 插入排序算法Java实现
 *
 * @author huyanglin
 * @date 2020/9/7 15:41
 */
public class InsertSort {
    /**
     * 插入排序算法Java实现
     *
     * @param arr 待排序数组
     * @return 排序后数组
     */
    public static  int[] insertSort(int[] arr) {
        //arr[0]不需要排序
        for (int i = 1; i < arr.length; i++) {
            //待插入的数
            int insertVal = arr[i];
            //待插入的位置
            int index = i - 1;
            //如果插入的树比之前的数小
            while (index >= 0 && insertVal < arr[index]) {
                arr[index + 1] = arr[index];
                index--;
            }
            //将插入的数放入合适的位置
            arr[index + 1] = insertVal;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] in = {1, 8, 4, 5, 3};
        insertSort(in);
    }
}
