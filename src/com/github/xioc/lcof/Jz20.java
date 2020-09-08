package com.github.xioc.lcof;

/**
 * @author huyanglin
 * @create 2020/8/30 9:50 上午
 */
public class Jz20 {
    public boolean isNumber(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        ;
        boolean isNum = false, isDot = false, isE = false;
        //去掉首尾空格

        char[] str = s.trim().toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] >= '0' && str[i] <= '9') {
                isNum = true;
            } else if (str[i] == '.') {
                //小数点之前已经有小数点或者E
                if (isDot || isE) {
                    return false;
                }
                isDot = true;
            } else if (str[i] == 'e' || str[i] == 'E') {
                //e前面没有数字或者已经有e
                if ((!isNum) || isE) {
                    return false;
                }
                isE = true;
                //重置isNum，e后面也需要接整数
                isNum = false;
            } else if (str[i] == '+' || str[i] == '-') {
                if (i != 0 && str[i - 1] != 'e' && str[i-1] != 'E') {
                    return false;
                }
            } else {
                return false;
            }
        }
        return isNum;
    }

    public static void main(String[] args) {
        System.out.println(new Jz20().isNumber("-1E-16"));
    }
}



