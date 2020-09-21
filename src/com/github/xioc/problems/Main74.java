package com.github.xioc.problems;

/**
 * @author hyldev
 * @date 2020/9/21 10:25
 */
public class Main74 {
    /**
     * 二维数组二分查找
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        //m * n矩阵
        int m = matrix.length, n = matrix[0].length;
        int low = 0, high = m * n - 1;
        while (low <= high) {
            int mid = (low + high) >> 1;
            int tmp = matrix[mid / n][mid % n];
            if (tmp > target) {
                high = mid - 1;
            }
            if (tmp < target) {
                low = mid + 1;
            }
            if (tmp == target) {
                return true;
            }
        }
        return false;
    }
}
