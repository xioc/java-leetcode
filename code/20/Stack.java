public class Stack {
    private String[] items;//数组
    private int count;//栈中元素的个数
    private int n;//栈的大小

    public Stack(int n) {
        items = new String[n];
        this.count = 0;
        this.n = n;
    }

    /**
     * 入栈操作
     *
     * @param item 待入栈元素
     * @return 入栈是否成功
     */
    public boolean push(String item) {
        if (count == n) {
            return false;
        }
        items[count] = item;
        count++;
        return true;

    }

    /**
     * 出栈操作
     *
     * @return
     */
    public String pop() {
        if (count == 0) {
            return null;
        }
        String temp = items[count - 1];
        count--;
        return temp;
    }


}