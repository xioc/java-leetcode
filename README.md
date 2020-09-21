
# Leetcode java实现

## 1 easy

#### 1 两数之和 -数组
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。  
你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。  
示例:  
给定 nums = [2, 7, 11, 15], target = 9  
因为 nums[0] + nums[1] = 2 + 7 = 9  
所以返回 [0, 1]  
[代码](./code/1/Solution.java)  

#### 20 有效的括号 -栈
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。   
有效字符串需满足：   
左括号必须用相同类型的右括号闭合。   
左括号必须以正确的顺序闭合。   
注意空字符串可被认为是有效字符串。  
[代码](./code/20/Solution.java) 

#### 21 合并两个有序链表 -单链表
将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。    
示例：   
输入：1->2->4, 1->3->4   
输出：1->1->2->3->4->4   
[代码](./code/21/Solution.java)   

#### 69 x的平方根   
实现 int sqrt(int x) 函数。    
计算并返回 x 的平方根，其中 x 是非负整数。    
由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。    
[代码](./code/69/Solution.java)

#### 141 环形链表 -单链表
给定一个链表，判断链表中是否有环。 
为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。  
输入：head = [3,2,0,-4], pos = 1   
输出：true   
解释：链表中有一个环，其尾部连接到第二个节点。  
[代码](./code/141/Solution.java)  

#### 155 最小栈 -栈
设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。   
push(x) -- 将元素 x 推入栈中。   
pop() -- 删除栈顶的元素。   
top() -- 获取栈顶元素。   
getMin() -- 检索栈中的最小元素。   
示例:   
MinStack minStack = new MinStack();   
minStack.push(-2);   
minStack.push(0);   
minStack.push(-3);   
minStack.getMin();   --> 返回 -3.   
minStack.pop();   
minStack.top();      --> 返回 0.   
minStack.getMin();   --> 返回 -2.   
[代码](./code/155/Solution.java) 

#### 206 反转链表 -单链表
反转一个单链表。  
示例:   
输入: 1->2->3->4->5->NULL   
输出: 5->4->3->2->1->NULL  
note:可以通过头插法来实现反转，或者让指针改变方向实现    
[代码](./code/206/Solution.java)   

#### 507 完美数
对于一个 正整数，如果它和除了它自身以外的所有正因子之和相等，我们称它为“完美数”。  
note:不需要从1遍历到本身，只需要遍历到平方根，因为如果有一个小于平方根的因数，必然有一个大于平方根的因数。    
[代码](./code/507/Solution.java)   


#### 876 链表的中间结点 -单链表
给定一个带有头结点 head 的非空单链表，返回链表的中间结点。   
如果有两个中间结点，则返回第二个中间结点。   
note:方法1 将结点装入数组，返回中间即可；方法2 快慢指针法   
[代码](./code/876/Solution.java)  

#### 1137 第 N 个泰波那契数
泰波那契序列 Tn 定义如下：   

T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
给你整数 n，请返回第 n 个泰波那契数 Tn 的值。  
note:通过循环，不断的交换三个数的值。  
[代码](./code/1137/Solution.java) 

## 2 medium 

#### 2 两数相加 -单链表
给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储一位数字。  
如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。  
您可以假设除了数字 0 之外，这两个数都不会以 0 开头。  
示例：  
输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)   
输出：7 -> 0 -> 8   
原因：342 + 465 = 807  
[代码](./code/2/Solution.java)  

#### 19 删除链表的倒数第N个节点 -单链表
给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。   
示例：   
给定一个链表: 1->2->3->4->5, 和 n = 2.   
当删除了倒数第二个节点后，链表变为 1->2->3->5.   
说明：  
给定的 n 保证是有效的。   
note:删除的时候需要考虑几个特殊情况，链表长为1的时候，删除第一个节点的时候。   
TODO:待修改:可以使用快慢指针，循环一次实现删除。  
[代码](./code/19/Solution.java)

#### 33 搜索旋转排序数组
假设按照升序排序的数组在预先未知的某个点上进行了旋转。    
( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。    
搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。    
假设数组中不存在重复的元素。    
算法时间复杂度必须是 O(log n) 级别。  
示例:    
输入: nums = [4,5,6,7,0,1,2], target = 0    
输出: 4    
[代码](./code/33/Solution.java)    

#### 150 逆波兰表达式求值 -栈,数组
根据逆波兰表示法，求表达式的值。   
有效的运算符包括 +, -, *, / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。  
说明：  
整数除法只保留整数部分。  
给定逆波兰表达式总是有效的。换句话说表达式总会得出有效数值且不存在除数为0的情况。  
示例 1：  
输入: ["2", "1", "+", "3", "*"]  
输出: 9  
解释: ((2 + 1) * 3) = 9   
[代码](./code/150/Solution.java)

#### 622 设计循环队列 -队列
设计你的循环队列实现。 循环队列是一种线性数据结构，其操作表现基于 FIFO（先进先出）原则并且队尾被连接在队首之后以形成一个循环。它也被称为“环形缓冲器”。   
循环队列的一个好处是我们可以利用这个队列之前用过的空间。在一个普通队列里，一旦一个队列满了，我们就不能插入下一个元素，即使在队列前面仍有空间。但是使用循环队列，我们能使用这些空间去存储新的值。   
你的实现应该支持如下操作：   
MyCircularQueue(k): 构造器，设置队列长度为 k 。   
Front: 从队首获取元素。如果队列为空，返回 -1 。   
Rear: 获取队尾元素。如果队列为空，返回 -1 。   
enQueue(value): 向循环队列插入一个元素。如果成功插入则返回真。   
deQueue(): 从循环队列中删除一个元素。如果成功删除则返回真。   
isEmpty(): 检查循环队列是否为空。   
isFull(): 检查循环队列是否已满。 
note:循环队列，可以空出一个位置来实现，也可以增加一个变量保存当前空间来实现.     
[代码](./code/622/Solution.java)

#### 912 排序数组 -排序
给定一个整数数组 nums，将该数组升序排列。     
注意：使用冒泡排序时间会超出，使用插入排序。     
[代码](./code/912/Solution.java)   


## 3 hard

## 4 剑指offer面试题
#### 3 数组中重复的数字
[代码](./code/jz03/Solution.java)    

#### 59-1 滑动窗口的最大值
[笔记](./note/Jz59-1.md)  

## 5 LeetCode精选题分类
### 1 算法思想
#### 1 双指针   
T167 有序数组的Two Sum  
[代码](./src/com/github/xioc/problems/Main167.java)    

T633 两个数的平方和  
[代码](./src/com/github/xioc/problems/Main633.java)     

T345 交换字符串中的元音字母     
[代码](./src/com/github/xioc/problems/Main345.java)  

T88 合并两个有序数组     
[代码](./src/com/github/xioc/problems/Main88.java)  
    
#### 2 排序  
#### 3 贪心思想  
#### 4 二分查找
#### 5 分治
#### 6 搜索
#### 7 动态规划  
#### 8 数学  
### 2 数据结构相关