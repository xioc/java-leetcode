package com.github.xioc.lcof;

/**
 * @author hyldev
 * @create 2020/8/23 5:17 下午
 */
public class Jz15 {
    public int hammingWeight(int n) {
        //利用Java API
        //return Integer.toBinaryString(n).replaceAll("0","").length();

        //利用Java 位运算
        int res = 0;
        while (n != 0) {
            res = res + n & 1;
            n = (n >>> 1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(5 & 1);
    }
}
