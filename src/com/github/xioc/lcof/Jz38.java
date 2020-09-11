package com.github.xioc.lcof;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hyldev
 * @date 2020/9/10 15:30
 * 抄作业
 */
public class Jz38 {
    char[] c;
    List<String> res = new LinkedList<>();

    public String[] permutation(String s) {
        c = s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);
    }

    private void dfs(int x) {
        if (x == c.length - 1) {
            //添加到排列方案
            res.add(String.valueOf(c));
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = x; i < c.length; i++) {
            if (set.contains(c[i])) {
                continue;
            }
            set.add(c[i]);
            //交换，将c[i]固定在第x位
            swap(i, x);
            //开启固定x+1位
            dfs(x + 1);
            //恢复交换
            swap(i, x);
        }
    }

    private void swap(int a, int b) {
        char tmp = c[a];
        c[a] = c[b];
        c[b] = tmp;
    }

}
