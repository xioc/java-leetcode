package com.github.xioc.lcof;

import com.github.xioc.basic.TreeNode;

/**
 * @author huyanglin
 * @create 2020/9/1 9:13 上午
 */
public class Jz26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (B == null || A == null) {
            return false;
        }
        return recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    boolean recur(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null || (A.val != B.val)) {
            return false;
        }
        return recur(A.left, B.left) && recur(A.right, B.right);
    }
}
