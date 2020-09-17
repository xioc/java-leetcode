package com.github.xioc.lcof;

/**
 * @author hyldev
 * @date 2020/9/17 15:38
 */
public class Jz58ii {
    public String reverseLeftWords(String s, int n) {
        return new StringBuilder(s.substring(n, s.length())).append(s.substring(0, n)).toString();
    }

    public String reverseLeftWords2(String s, int n) {
        return (s + s).substring(n, n + s.length());

    }
}
