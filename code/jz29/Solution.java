import java.util.Arrays;

/**
 * @author hyldev
 * @create 2020/8/21 10:18 下午
 */

//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
//
//
//
// 示例 1：
//
// 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
//输出：[1,2,3,6,9,8,7,4,5]
//
//
// 示例 2：
//
// 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//输出：[1,2,3,4,8,12,11,10,9,5,6,7]
//
//
//
//
// 限制：
//
//
// 0 <= matrix.length <= 100
// 0 <= matrix[i].length <= 100
//
//
// 注意：本题与主站 54 题相同：https://leetcode-cn.com/problems/spiral-matrix/
// Related Topics 数组
// 👍 128 👎 0
public class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;
        int index = 0;
        int[] res = new int[(right + 1) * (bottom + 1)];
        while (true) {
            //从右向左
            for (int i = left; i <= right; i++) {
                res[index] = matrix[top][i];
                index++;
            }
            if (++top > bottom) {
                break;
            }
            //从上到下
            for (int i = top; i <= bottom; i++) {
                res[index] = matrix[i][right];
                index++;
            }
            if (left > --right) {
                break;
            }
            //从右到左
            for (int i = right; i >= left; i--) {
                res[index] = matrix[bottom][i];
                index++;
            }
            if (top > --bottom) {
                break;
            }
            //从下到上
            for (int i = bottom; i >= top; i--) {
                res[index] = matrix[i][left];
                index++;
            }
            if (++left > right) {
                break;
            }
        }
        return res;
    }

    /**
     * 简单易懂版
     * @param matrix
     * @return
     */
    public int[] spiralOrder2(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;
        int index = 0;
        int[] res = new int[(right + 1) * (bottom + 1)];
        while (true) {
            //从左到右
            for (int i = left; i <= right; i++) {
                res[index] = matrix[top][i];
                index++;
            }
            //一行结束，top增加1，从上至下的过程中排除一个重复元素
            top++;
            if (top > bottom) {
                break;
            }

            //从上到下
            for (int i = top; i <= bottom; i++) {
                res[index] = matrix[i][right];
                index++;
            }
            //右边一列完成，right++
            right--;
            if (left > right) {
                break;
            }

            //从右到左
            for (int i = right; i >= left; i--) {
                res[index] = matrix[bottom][i];
                index++;
            }
            //最下方一列完成，bottom--
            bottom--;
            if (top > bottom) {
                break;
            }

            //从下到上
            for (int i = bottom; i >= top; i--) {
                res[index] = matrix[i][left];
                index++;
            }
            //最左边一列完成，left++
            left++;
            if (right < left) {
                break;
            }
        }
        return res;
    }
}
