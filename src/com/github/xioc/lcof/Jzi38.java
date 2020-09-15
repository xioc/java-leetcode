package com.github.xioc.lcof;

import java.util.HashSet;
import java.util.Set;

/**
 * @author hyldev
 * @date 2020/9/11 14:26
 * @see Jz38
 */
public class Jzi38 {
    Set<String> result = new HashSet<>();

    public String[] permutation(String s) {
        if (s == null || s.length() == 0) {
            return new String[0];
        }
        //标记访问过的位置信息
        boolean[] visited = new boolean[s.length()];
        recur(s, "", visited);
        return result.toArray(new String[result.size()]);
    }

    private void recur(String s, String letter, boolean[] visited) {
        if (s.length() == letter.length()) {
            result.add(letter);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            recur(s, letter + temp, visited);
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        String[] strs = new Jzi38().permutation(s);
        for (String str : strs) {
            System.out.print(str+"  ");
        }
    }
}
