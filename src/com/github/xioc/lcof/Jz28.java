package com.github.xioc.lcof;

import com.github.xioc.basic.TreeNode;

/**
 * @author huyanglin
 * @date 2020/9/2 10:09
 */
public class Jz28 {
    private StringBuilder builder = new StringBuilder();

    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : recur(root.left, root.right);
    }

    private boolean recur(TreeNode L, TreeNode R) {
        if (L == null && R == null) {
            return true;
        }
        if (L == null || R == null || L.val != R.val) {
            return false;
        }
        return recur(L.left, R.right) && recur(L.right, R.left);
    }

    public boolean isSymmetric1(TreeNode root) {
        if (builder.toString().equals(builder.reverse().toString())) {
            return true;
        }
        return false;
    }

    private void printVal(TreeNode root) {
        if (root != null) {
            printVal(root.left);
            builder.append(root.val);
            printVal(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.left = node2;
        node1.right = node3;
    }

}
