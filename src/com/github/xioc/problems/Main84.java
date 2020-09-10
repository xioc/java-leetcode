package com.github.xioc.problems;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @author hyldev
 * @create 2020/6/14 10:01 上午
 */
public class Main84 {
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6};
        System.out.println(largestRectangleArea(heights));
        System.out.println(largestRectangleArea2(heights));

    }

    public static int largestRectangleArea(int[] heights) {
        int res = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        int[] copyHeight = new int[heights.length + 2];
        for (int i = 0; i < heights.length; i++) {
            copyHeight[i + 1] = heights[i];
        }
        //System.out.println(Arrays.toString(copyHeight));
        for (int i = 0; i < copyHeight.length; i++) {
            while (!stack.isEmpty() && copyHeight[stack.peek()] > copyHeight[i]) {
                int cur = stack.pop();
                res = Math.max(res, (i - stack.peek() - 1) * copyHeight[cur]);
            }
            stack.push(i);
        }
        return res;
    }


    public static int largestRectangleArea2(int[] heights) {
        int res = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        int[] copyHeights = new int[heights.length + 2];
        copyHeights[0] = copyHeights[copyHeights.length - 1] = -1;
        for (int j = 0; j < heights.length; j++) {
            copyHeights[j + 1] = heights[j];
        }
        //System.out.println(Arrays.toString(copyHeights));
        for (int i = 0; i < copyHeights.length; i++) {
            //栈不为空，且下一个元素小于栈顶元素
            while (!stack.isEmpty() && copyHeights[i] < copyHeights[stack.peek()]) {
                //出栈，计算面积
                int index = stack.pop();
                int area = (i - stack.peek() - 1) * copyHeights[index];
                res = Math.max(res, area);
            }
            stack.push(i);
        }
        return res;
    }
}
