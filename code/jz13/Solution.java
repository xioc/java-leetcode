//地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一
//格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但
//它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
//
//
//
// 示例 1：
//
// 输入：m = 2, n = 3, k = 1
//输出：3
//
//
// 示例 2：
//
// 输入：m = 3, n = 1, k = 0
//输出：1
//
//
// 提示：
//
//
// 1 <= n,m <= 100
// 0 <= k <= 20
//
// 👍 144 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
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
}
//leetcode submit region end(Prohibit modification and deletion)
