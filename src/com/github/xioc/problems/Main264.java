package com.github.xioc.problems;

/**
 * @author hyldev
 * @date 2020/9/5 17:37
 */
public class Main264 {
    public int nthUglyNumber(int n) {
        if (n <= 0) {
            return 0;
        }
        //定义数组保存第n个丑数
        int[] data = new int[n];
        data[0] = 1;
        int next2 = 0, next3 = 0, next5 = 0;
        //下一个丑数在数组中的位置
        int nextUglyIndex = 1;
        while (nextUglyIndex < n) {
            int minValue = min(data[next2] * 2, data[next3] * 3, data[next5] * 5);
            data[nextUglyIndex] = minValue;
            while (data[next2] * 2 <= data[nextUglyIndex]) {
                next2++;
            }
            while (data[next3] * 3 <= data[nextUglyIndex]) {
                next3++;
            }
            while (data[next5] * 5 <= data[nextUglyIndex]) {
                next5++;
            }
            nextUglyIndex++;
        }


        return data[n - 1];
    }

    private int min(int a, int b, int c) {
        int res = a < b ? a : b;
        return res < c ? res : c;
    }

    public static void main(String[] args) {
        System.out.println(new Main264().nthUglyNumber(37));
    }
}
