package com.github.xioc.lcof;

/**
 * @author huyanglin
 * @create 2020/8/26 4:56 下午
 */
public class Jz16 {
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        long b = n;
        double res = 1.0;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }
        while (b != 0) {
            if ((b & 1) == 1) {
                res = res * x;
            }
            x = x * x;
            b = b >> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Jz16().myPow(2.0, -3));
    }
}
