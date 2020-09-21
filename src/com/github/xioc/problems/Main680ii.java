package com.github.xioc.problems;

/**
 * @author hyldev
 * @date 2020/9/21 17:39
 */
public class Main680ii {
    int del = 0;

    public boolean validPalindrome(String s) {

        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                if (del == 0) {
                    del++;
                    return validPalindrome(s.substring(i, j))
                            || validPalindrome(s.substring(i + 1, j + 1));
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean validReverse(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    public static void main(String[] args) {
        System.out.println(new Main680ii().validPalindrome("abca"));
    }
}
