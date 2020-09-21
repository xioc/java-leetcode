package com.github.xioc.problems;


/**
 * @author hyldev
 * @date 2020/9/21 16:52
 */
public class Main345 {

    public String reverseVowels(String s) {
        String template = "aeiouAEIOU";

        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        while (i < j) {
            while (i < j && !template.contains(chars[i] + "")) {
                i++;
            }
            while (i < j && !template.contains(chars[j] + "")) {
                j--;
            }

            changeChar(chars, i, j);
            i++;
            j--;
        }
        return new String(chars);
    }

    private void changeChar(char[] chars, int i, int j) {
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }

    public static void main(String[] args) {
        System.out.println(new Main345().reverseVowels("hello"));
    }
}
