package com.github.xioc.lcof;


import java.util.Arrays;

/**
 * @author huyanglin
 * @create 2020/8/21 10:18 下午
 */
public class Jz29 {
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


    public static void main(String[] args) {
        int[][] in = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //int[] res = new Jz29().spiralOrder(in);
        int[] res2 = new Jz29().spiralOrder2(in);
        //System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(res2));
    }

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
            right--;
            if (left > right) {
                break;
            }

            //从右到左
            for (int i = right; i >= left; i--) {
                res[index] = matrix[bottom][i];
                index++;
            }
            bottom--;
            if (top > bottom) {
                break;
            }
            //从下到上
            for (int i = bottom; i >= top; i--) {
                res[index] = matrix[i][left];
                index++;
            }
            left++;
            if (right < left) {
                break;
            }
        }
        return res;
    }
}
