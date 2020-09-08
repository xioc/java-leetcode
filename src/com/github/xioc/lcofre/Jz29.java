package com.github.xioc.lcofre;

import java.util.Arrays;

/**
 * @author huyanglin
 * @date 2020/9/2 10:49
 */
public class Jz29 {
    public static int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        //找四个边界
        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        int[] res = new int[(bottom + 1) * (right + 1)];
        //用作数组的index
        int index = 0;

        while (true) {

            //从左向右遍历
            for (int i = left; i <= right; i++) {
                res[index] = matrix[top][i];
                index++;
            }
            top++;
            if (top > bottom) {
                break;
            }

            //从上到下遍历
            for (int i = top; i <= bottom; i++) {
                res[index] = matrix[i][right];
                index++;
            }
            right--;
            if (left > right) {
                break;
            }

            //从右到左遍历
            for (int i = right; i >= left; i--) {
                res[index] = matrix[bottom][i];
                index++;
            }
            bottom--;
            if (top > bottom) {
                break;
            }

            //从下到上遍历
            for (int i = bottom; i >= top; i--) {
                res[index] = matrix[i][left];
                index++;
            }
            left++;
            if (left > right) {
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        //int[][] in = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] in = {{7},{9},{6}};
        int[] ints = spiralOrder(in);
        System.out.println(Arrays.toString(ints));
    }
}
