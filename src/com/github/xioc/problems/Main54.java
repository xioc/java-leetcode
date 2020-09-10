package com.github.xioc.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hyldev
 * @create 2020/8/22 4:59 下午
 */
public class Main54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = null;
        if (matrix == null || matrix.length == 0) {
            return new ArrayList<Integer>();
        }
        //left-左边界 right-右边界 top-上边界 bottom-下边界
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;
        res = new ArrayList<>((right + 1) * (bottom + 1));
        while (true) {
            //从左到右
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;
            if (top > bottom) {
                break;
            }

            //从上到下
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;
            if (right < left) {
                break;
            }

            //从右到左
            for (int i = right; i >= left; i--) {
                res.add(matrix[bottom][i]);
            }
            bottom--;
            if (top > bottom) {
                break;
            }

            //从下到上
            for (int i = bottom; i >= top; i--) {
                res.add(matrix[i][left]);
            }
            left++;
            if (left > right) {
                break;
            }
        }
        return res;
    }
}