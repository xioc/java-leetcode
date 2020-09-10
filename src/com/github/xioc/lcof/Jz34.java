package com.github.xioc.lcof;

import com.github.xioc.basic.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hyldev
 * @date 2020/9/9 11:28
 */
public class Jz34 {
    LinkedList<Integer> path = new LinkedList<>();
    private LinkedList<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        recur(root, sum);
        return res;
    }

    private void recur(TreeNode root, int tar) {
        if (root == null) {
            return;
        }

        path.add(root.val);
        tar = tar - root.val;
        if (tar == 0 && root.left == null && root.right == null) {
            res.add(new LinkedList<>(path));
        }
        path.removeLast();
        recur(root.left, tar);
        recur(root.right, tar);
    }

}
