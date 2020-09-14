package com.github.xioc.lcof;

import com.github.xioc.basic.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hyldev
 * @date 2020/9/14 22:07
 * 二叉搜索树查找第k大结点
 * 思路：
 * 1.中序遍历加入List，返回下标为list.size - k 的元素即可
 * 2.按照右子树 -> 根结点 ->左子树 的顺序访问，直接找到第k个结点即可。
 * 掌握程度： 2次成功，2种方案解决。方法2效率更高
 */
public class Jz54 {
    private List<Integer> list = new ArrayList<>();

    int res = -1;
    int k;

    public int kthLargest(TreeNode root, int k) {
        recur(root);
        return list.get(list.size() - k);
    }

    private void recur(TreeNode root) {
        if (root == null) {
            return;
        }
        recur(root.left);
        list.add(root.val);
        recur(root.right);
    }

    public int kthLargest2(TreeNode root, int k) {
        this.k = k;
        recur2(root);
        return res;
    }

    private void recur2(TreeNode root) {
        if (root == null) {
            return;
        }
        recur2(root.right);
        k--;
        if (k == 0) {
            res = root.val;
        }
        recur2(root.left);
    }
}
