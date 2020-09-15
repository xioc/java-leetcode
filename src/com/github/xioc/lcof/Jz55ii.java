package com.github.xioc.lcof;

import com.github.xioc.basic.TreeNode;

/**
 * @author hyldev
 * @date 2020/9/15 10:29
 * <p>
 * 思路：平衡二叉树的左右子树高度差不大于1
 * 掌握程度：3次通过
 * note：利用高度判断
 */
public class Jz55ii {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return recur(root);
    }

    private boolean recur(TreeNode root) {
        if (root == null) {
            return true;
        }
        int dis = Math.abs(getDepth(root.left) - getDepth(root.right));
        if (dis > 1) {
            return false;
        }
        boolean leftState = recur(root.left);
        boolean rightState = recur(root.right);
        return leftState && rightState;
    }

    private int getDepth(TreeNode root) {
        int ld, rd;
        if (root == null) {
            return 0;
        }
        ld = getDepth(root.left);
        rd = getDepth(root.right);
        return (ld > rd ? ld : rd) + 1;
    }
}
