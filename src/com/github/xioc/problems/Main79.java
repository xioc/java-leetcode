package com.github.xioc.problems;

/**
 * @author hyldev
 * @create 2020/8/22 9:41 下午
 */
public class Main79 {
    public static void main(String[] args) {
        char[][] in = {{'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";//true
        String word1 = "SEE";//true
        String word2 = "ABCB";//false
        System.out.println(new Main79().exist(in, word));
    }

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

    private boolean dfs(char[][] board, char[] words, int i, int j, int k) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != words[k]) {
            return false;
        }
        if (k == words.length - 1) {
            return true;
        }
        char tmp = board[i][j];
        board[i][j] = '/';
        boolean res = dfs(board, words, i + 1, j, k + 1)
                || dfs(board, words, i - 1, j, k + 1)
                || dfs(board, words, i, j - 1, k + 1)
                || dfs(board, words, i, j + 1, k + 1);

        board[i][j] = tmp;
        return res;
    }

}
