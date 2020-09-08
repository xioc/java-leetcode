package com.github.xioc.lcof;

/**
 * @author huyanglin
 * @create 2020/8/22 11:08 下午
 */
public class Jz141 {

    public int cuttingRope2(int n) {
        if (n == 2) {
            return 1;
        }
        int res = -1;
        for (int i = 1; i <= n - 1; i++) {
            res = Math.max(res, Math.max(i * (n - i), cuttingRope(n - i) * i));
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Jz141().cuttingRope(8));
        System.out.println(Integer.MAX_VALUE);
    }

    public int cuttingRope3(int n) {
        //自底向上求解
        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }

        int[] res = new int[n + 1];
        res[0] = 0;
        res[1] = 1;
        res[2] = 2;
        res[3] = 3;
        int max = 0;
        for (int i = 4; i <= n; i++) {
            max = 0;
            for (int j = 1; j <= i / 2; j++) {
                int tmp = res[j] * res[i - j];
                if (max < tmp) {
                    max = tmp;
                }
            }
            res[i] = max;
        }
        return res[n];
    }

    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            int max = 0;
            for (int j = 1; j < i; j++) {
                max = Math.max(max, Math.max(j * (i - j), j * dp[i - j]));
            }
            dp[i] = max;
        }

        return dp[n];
    }

    public int cuttingRope4(int n) {
        //未通过
        int p = 1000000007;
        double[] dp = new double[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            double max = 0;
            for (int j = 1; j < i; j++) {
                double tmp1 = (j * dp[i - j]);
                double tmp2 = (j * (i - j));
                max = Math.max(max, Math.max(tmp1, tmp2));
            }
            dp[i] = max;
        }

        return (int) dp[n] % p;
    }


}
