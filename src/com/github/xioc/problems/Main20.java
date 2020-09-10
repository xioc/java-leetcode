package com.github.xioc.problems;

import java.util.Stack;

/**
 * @author hyldev
 * @create 2020/6/11 2:50 下午
 */
public class Main20 {
    public static void main(String[] args) {
        String str = "()";
        System.out.println(new Main20().isValid(str));

    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '[') {
                stack.push(']');
            } else if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else {
                if (stack.isEmpty() || !stack.pop().equals(c)) {
                    return false;
                }
            }
        }
        if (stack.isEmpty()){
            return true;
        }
        return false;

    }
}
