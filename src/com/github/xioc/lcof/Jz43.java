package com.github.xioc.lcof;

/**
 * @author hyldev
 * @date 2020/9/14 09:58
 */

/**
 * 例如，输入12，1～12这些整数中包含1 的数字有1、10、11和12，1一共出现了5次。
 */
public class Jz43 {
    public int countDigitOne(int n) {

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (String.valueOf(i).contains("1")) {

                count=count+getOneNum(i);
            }
        }
        return count;
    }



    private int getOneNum(int i) {
        int k = 0;
        String s = String.valueOf(i);
        for(int j = 0;j<s.length();j++){
            if(s.charAt(j)=='1'){
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println(new Jz43().countDigitOne(12));
    }
}
