## 数组中重复的数字  
## 题目链接
[传送门](https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/)
## 代码
```java
class Solution {
    public int findRepeatNumber(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[nums[i]] += 1;
        }
        for (int i = 0; i < result.length; i++) {
            if (result[i] >= 2) {
                return i;
            }
        }
        return 0;
    }
}
```
## 笔记