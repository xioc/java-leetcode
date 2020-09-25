## 二维数组中的查找 
## 题目链接
[传送门](https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/)
## 代码
```java
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int columns = matrix[0].length;
        int rows = matrix.length;
        int row = 0, column = columns - 1;
        while (row < rows && column >= 0) {
            int num = matrix[row][column];
            if (num == target) {
                return true;
            }
            if (target > num) {
                row += 1;
            }
            if (target < num) {
                column -= 1;
            }
        }
        return false;
    }
}
```
## 笔记