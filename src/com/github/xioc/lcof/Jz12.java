package com.github.xioc.lcof;

/**
 * @author hyldev
 * @create 2020/8/22 9:23 下午
 */
public class Jz12 {
    public boolean exist(char[][] board, String word) {

        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, words, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * @param board 待查找二维数组
     * @param words 待查找字符数组
     * @param i     行
     * @param j     列
     * @param k     字符串中的顺序
     * @return
     */
    private boolean dfs(char[][] board, char[] words, int i, int j, int k) {
        boolean condition = i >= board.length || i < 0
                || j >= board[0].length || j < 0 || board[i][j] != words[k];
        if (condition) {
            return false;
        }
        if (k == words.length - 1) {
            //k移动到末尾代表找到
            return true;
        }
        char tmp = board[i][j];
        board[i][j] = '/';

        boolean res = dfs(board, words, i + 1, j, k + 1)
                || dfs(board, words, i - 1, j, k + 1)
                || dfs(board, words, i, j + 1, k + 1)
                || dfs(board, words, i, j - 1, k + 1);

        board[i][j] = tmp;

        return res;
    }
}
