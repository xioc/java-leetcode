package com.github.xioc.lcof;

/**
 * @author hyldev
 * @date 2020/9/16 10:19
 * 思路：
 * 1.利用Java API
 * 2.使用双指针
 * 掌握程度：思路1 自己实现 思路2 参考题解
 * note：
 */
public class Jz58i {
    public String reverseWords(String s) {
        String s1 = s.trim();
        String[] strArray = s1.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = strArray.length - 1; i >= 0; i--) {
            builder.append(strArray[i]);
            builder.append(" ");
        }
        return builder.toString().replaceAll(" +", " ").trim();
    }

    public String reverseWords2(String s) {
        s = s.trim();
        int j = s.length() - 1, i = j;
        StringBuilder res = new StringBuilder();
        while (i >= 0) {
            //搜索首个空格
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            //添加单词
            res.append(s.substring(i + 1, j + 1) + " ");
            //跳过单词间空格
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            //指向下个单词的尾字符
            j = i;
        }
        return res.toString().trim();
    }
}
