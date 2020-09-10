package com.github.xioc.problems;

/**
 * @author hyldev
 * @create 2020/8/26 10:45 下午
 */
public class Main50 {
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        double res = 1.0;
        long b = n;
        if (b < 0) {
            b = -b;
            x = 1 / x;
        }
        while (b > 0) {
            if (b % 2 == 1) {
                res = res * x;
            }
            x = x * x;
            b = b / 2;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Main50().myPow(2.0, 3));
    }
}
