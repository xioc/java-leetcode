package com.github.xioc.lcof;


/**
 * @author hyldev
 * @date 2020/9/4 22:26
 */
public class Jz49 {
    public int nthUglyNumber(int n) {
        int index = 1;
        int count = 0;
        while (true) {
            if (count == n) {
                break;
            }
            if (isUgly(index)) {
                count++;
            }
            index++;
        }
        return --index;
    }


    public static void main(String[] args) {

        //System.out.println(new Jz49().nthUglyNumber(1600));
        System.out.println(new Jz49().nthUglyNumber2(1600));
    }

    private boolean isUgly(int n) {
        while ((n & 1) == 0) {
            n = (n >> 1);
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        while (n % 5 == 0) {
            n = n / 5;
        }
        return (n == 1) ? true : false;
    }

    public int nthUglyNumber2(int n) {
        if (n <= 0) {
            return 0;
        }
        //保存第N个丑数
        int[] data = new int[n];
        data[0] = 1;
        int nextUglyIndex = 1;
        int next2 = 0;
        int next3 = 0;
        int next5 = 0;
        while (nextUglyIndex < n) {
            int minValue = min(2 * data[next2], 3 * data[next3], 5 * data[next5]);
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

}
