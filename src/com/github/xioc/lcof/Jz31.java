package com.github.xioc.lcof;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author huyanglin
 * @date 2020/9/2 16:07
 */
public class Jz31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        int index = 0;
        for (int num : pushed) {
            stack.push(num);
            while (!stack.isEmpty() && stack.peek() == popped[index]) {
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }
}
