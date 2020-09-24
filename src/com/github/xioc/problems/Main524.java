package com.github.xioc.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author hyldev
 * @date 2020/9/21 21:14
 *
 * 思路：双指针思想
 * 掌握程度：根据思路实现
 * note：
 */
public class Main524 {

    /***方法1***/

    public String findLongestWord(String s, List<String> d) {
        if (s == null || s.length() == 0) {
            return "";
        }
        List<String> res = new ArrayList<>();
        int maxLength = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < d.size(); i++) {
            int p1 = 0, p2 = 0;
            String tmp = d.get(i);
            if (tmp.length() < maxLength) {
                continue;
            }
            char[] charTmp = tmp.toCharArray();
            while (p1 < chars.length && p2 < charTmp.length) {
                if (chars[p1] == charTmp[p2]) {
                    p1++;
                    p2++;
                } else {
                    p1++;
                }
            }
            if (p2 == charTmp.length) {
                res.add(tmp);
                maxLength = tmp.length();
            }
        }

        return selectLongStr(res);
    }

    private String selectLongStr(List<String> res) {
        Collections.sort(res, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    for (int i = 0; i < o1.length(); i++) {
                        if (o1.charAt(i) > o2.charAt(i)) {
                            return 1;
                        } else if (o1.charAt(i) < o2.charAt(i)) {
                            return -1;
                        } else {
                            continue;
                        }
                    }
                } else {
                    return o1.length() - o2.length() > 0 ? 1 : -1;
                }
                return 0;
            }
        });
        return res.size() > 0 ? res.get(0) : "";
    }

    /***   方法2    ***/

    public boolean isSubsequence(String subStr, String targetStr) {
        int j = 0;
        for (int i = 0; i < targetStr.length() && j < subStr.length(); i++) {
            if (subStr.charAt(j) == targetStr.charAt(i)) {
                j++;
            }
        }
        return j == subStr.length();
    }

    public String findLongestWord2(String s, List<String> d) {
        String maxStr = "";
        for (String tmp : d) {
            if (isSubsequence(tmp, s)) {
                if (tmp.length() > maxStr.length() || (tmp.length() == maxStr.length() && tmp.compareTo(maxStr) < 0)) {
                    maxStr = tmp;
                }
            }
        }
        return maxStr;
    }

    public static void main(String[] args) {
        String s = "applezjiaojqnncomxiioclpvoapppb  n";
        List<String> list = new ArrayList<>();
        list.add("zxc");
        list.add("vbn");
        System.out.println(new Main524().findLongestWord(s, list));
        System.out.println(new Main524().findLongestWord2(s, list));
        System.out.println(new Main524().isSubsequence("zxc", "zyuuixkooc"));
    }
}
