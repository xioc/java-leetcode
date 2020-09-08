package com.github.xioc.lcof;

import com.github.xioc.basic.TreeNode;

/**
 * @author huyanglin
 * @date 2020/9/2 09:54
 */
public class Jz27 {
    public static TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode tmp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmp);
        return root;
    }

    public static void main(String[] args) {
        //TreeNode node = new TreeNode(1);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.left = node2;
        node1.right = node3;
        mirrorTree(node1);
    }
}
