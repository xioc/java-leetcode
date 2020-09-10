package com.github.xioc.lcof;

/**
 * @author hyldev
 * @create 2020/8/22 9:54 下午
 */
public class Jz13 {

    private int m, n, k;
    boolean[][] visited;

    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        visited = new boolean[m][n];

        return dfs(0, 0);
    }

    private int dfs(int i, int j) {
        if (i >= m || j >= n || i < 0 || j < 0 || k < calSum(i, j) || visited[i][j]) {
            //结束递归的条件
            //1.越界
            //2.k<数位和
            //3.i,j位置已经访问过
            return 0;
        }
        visited[i][j] = true;
        return 1 + dfs(i + 1, j)
                + dfs(i - 1, j)
                + dfs(i, j + 1)
                + dfs(i, j - 1);
    }

    private int calSum(int i, int j) {
        int sumI = 0, sumJ = 0;
        sumI = (i == 100) ? 1 + i % 10 + i / 10 : i % 10 + i / 10;
        sumJ = (j == 100) ? 1 + j % 10 + j / 10 : j % 10 + j / 10;
        return sumI + sumJ;
    }

    public static void main(String[] args) {
        System.out.println(new Jz13().movingCount(2, 3, 1));
    }
}
