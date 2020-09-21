package com.github.xioc.problems;

import com.github.xioc.basic.TreeNode;

/**
 * @author hyldev
 * @date 2020/9/21 10:45
 * 思路： 逆序中序遍历，累加即可。
 * 掌握程度：
 * note：
 */
public class Main538 {
    int addValue = 0;

    public TreeNode convertBST(TreeNode root) {
        recur(root);
        return root;
    }

    private void recur(TreeNode root) {
        if (root == null) {
            return;
        }
        recur(root.right);
        addValue = root.val + addValue;
        root.val = addValue;
        recur(root.left);

    }
}
