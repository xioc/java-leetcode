package com.github.xioc.lcof;

/**
 * @author huyanglin
 * @create 2020/8/26 10:55 下午
 */
public class Jz17 {
    public int[] printNumbers(int n) {
        int end = (int) (Math.pow(10.0, n) - 1);
        int[] res = new int[end];
        for (int i = 0; i < end; i++) {
            res[i] = i + 1;
        }
        return res;
    }
}
