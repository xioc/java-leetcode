package com.github.xioc.lcof;

/**
 * @author huyanglin
 * @date 2020/9/5 21:37
 */
public class Jz33 {
    /**
     * 验证此序列是否是二叉搜索树的后续遍历序列
     *
     * @param postorder
     * @return
     */
    public boolean verifyPostorder(int[] postorder) {
        if (postorder == null || postorder.length == 0) {
            return false;
        }
        if (postorder.length == 1) {
            return true;
        }
        //后序遍历，最后一个节点为根结点
        int root = postorder[postorder.length - 1];
        //i用来记录位置，找到左右子树的交汇点
        int i = 0;
        for (; i < postorder.length; i++) {
            if (postorder[i] > root) {
                break;
            }
        }


        //右子树均大于root
        for (int j = i; j < postorder.length - 1; j++) {
            if (postorder[j] < root) {
                return false;
            }
        }

        boolean left = true;
        if (i > 0) {
            int[] leftArray = new int[i];
            for (int k = 0; k < i; k++) {
                leftArray[k] = postorder[k];
            }
            left = verifyPostorder(leftArray);
        }
        boolean right = true;
        if (i < postorder.length - 1) {
            int[] rightArray = new int[postorder.length - i - 1];
            for (int k = 0; k < postorder.length - 1 - i; k++) {
                rightArray[k] = postorder[k + i];
            }
            right = verifyPostorder(rightArray);
        }

        return (left && right);
    }

    public static void main(String[] args) {
        int[] in = {7, 4, 6, 5};
        //int[] in = {5, 7, 6};
        System.out.println(new Jz33().verifyPostorder(in));
    }

    public boolean verifyPostorder2(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }

    /**
     *
     * @param postorder
     * @param i
     * @param j
     * @return
     */
    private boolean recur(int[] postorder, int i, int j) {


        return false;
    }
}
