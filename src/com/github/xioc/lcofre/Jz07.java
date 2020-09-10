package com.github.xioc.lcofre;

import com.github.xioc.basic.TreeNode;

import java.util.HashMap;

/**
 * @author huyanglin
 * @date 2020/9/10 09:23
 */
public class Jz07 {

    /**
     * 建立值和下标的对应关系，可以根据值快速查询到在中序遍历中的下标
     */
    HashMap<Integer, Integer> dic = new HashMap<>();
    int[] pre;

    /**
     * 根据前序遍历和中序遍历重建二叉树
     *
     * @param preorder 前序遍历
     * @param inorder  中序遍历
     * @return 二叉树
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        pre = preorder;
        for (int i = 0; i < inorder.length; i++) {
            dic.put(inorder[i], i);
        }
        return recur(0, 0, inorder.length - 1);
    }

    /**
     * @param preRoot 前序遍历序列中根结点的index
     * @param inLeft  中序遍历中左边界index
     * @param inRight 中序遍历右边界index
     * @return 建立好的二叉树
     */
    private TreeNode recur(int preRoot, int inLeft, int inRight) {
        if (inLeft > inRight) {
            return null;
        }
        TreeNode root = new TreeNode(pre[preRoot]);
        //查找在中序遍历中的序号
        int i = dic.get(pre[preRoot]);
        root.left = recur(preRoot + 1, inLeft, i - 1);
        //注意:右子树的根结点坐标计算
        //左子树的长度=中序遍历中根结点index - 1 - inLeft + 1
        root.right = recur(preRoot + (i - inLeft) + 1, i + 1, inRight);
        return root;
    }
}
