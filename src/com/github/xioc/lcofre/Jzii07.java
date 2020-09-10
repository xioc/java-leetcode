package com.github.xioc.lcofre;

import com.github.xioc.basic.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author hyldev
 * @date 2020/9/10 14:44
 * @see Jz07
 */
public class Jzii07 {
    /**
     * @param preorder 前序遍历数组
     * @param inorder  中序遍历数组
     * @return
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //数组转List
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        for (int i = 0; i < preorder.length; i++) {
            pre.add(preorder[i]);
            in.add(inorder[i]);
        }
        return recur(pre, in);
    }

    /**
     * @param pre 前序遍历List
     * @param in  中序遍历List
     * @return 建立的二叉树
     */
    private TreeNode recur(List<Integer> pre, List<Integer> in) {
        //列表为空，代表已经遍历完成
        if (pre.size() == 0) {
            return null;
        }
        //建立根结点
        int rootVal = pre.get(0);
        TreeNode root = new TreeNode(rootVal);

        //从中序遍历中找到root的位置，用以分割List
        int rootIndex = in.indexOf(rootVal);

        root.left = recur(pre.subList(1, 1 + rootIndex), in.subList(0, rootIndex));
        root.right = recur(pre.subList(1 + rootIndex, pre.size()), in.subList(rootIndex + 1, in.size()));

        return root;
    }
}
