package com.github.xioc.lcof;


import java.util.Stack;

/**
 * @author hyldev
 * @date 2020/9/2 14:34
 */
public class Jz30 {

    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    /**
     * initialize your data structure here.
     */
    public Jz30() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        int y = mainStack.peek();
        mainStack.pop();
        if (y == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return mainStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
