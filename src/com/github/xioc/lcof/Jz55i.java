package com.github.xioc.lcof;

import com.github.xioc.basic.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author hyldev
 * @date 2020/9/14 22:31
 * 思路：DFS和BFS两种方式
 * 1.DFS  后序遍历二叉树，树的高度=Max(左子树高度，右子树高度)+1
 * 2.BFS
 * 掌握程度：
 * note:
 */
public class Jz55i {
    /**
     * DFS
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        int ld, rd;
        if (root == null) {
            return 0;
        }
        ld = maxDepth(root.left);
        rd = maxDepth(root.right);
        return (ld > rd ? ld : rd) + 1;
    }

    /**
     * BFS
     *
     * @param root
     * @return
     */
    public int maxDepth2(TreeNode root) {
        int res = 0;
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        Queue<TreeNode> tmp;
        while (!queue.isEmpty()) {
            tmp = new LinkedList<>();
            for (TreeNode node : queue) {
                if (node.left != null) {
                    tmp.add(node.left);
                }
                if (node.right != null) {
                    tmp.add(node.right);
                }
            }
            queue = tmp;
            res++;
        }

        return res;
    }

    public int maxDepth3(TreeNode root) {
        int res = 0;
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        Queue<TreeNode> tmp;
        while (!queue.isEmpty()) {
            tmp = new LinkedList<>();
            for (TreeNode node : queue) {
                if (node.left != null) {
                    tmp.add(node.left);
                }
                if (node.right != null) {
                    tmp.add(node.right);
                }
            }
            queue = tmp;
            res++;
        }
        return res;
    }
}
