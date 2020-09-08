package com.github.xioc.problems;

import com.github.xioc.basic.MyCircularDeque;

import java.util.Arrays;

/**
 * @author huyanglin
 * @create 2020/7/4 5:52 下午
 */
public class Main641 {
    public static void main(String[] args) {
        MyCircularDeque myQueue = new MyCircularDeque(3);
        //System.out.println(Arrays.toString(myQueue.array));

        System.out.println(myQueue.insertLast(1));
        System.out.println(Arrays.toString(myQueue.array));

        System.out.println(myQueue.insertLast(2));
        System.out.println(Arrays.toString(myQueue.array));

        System.out.println(myQueue.insertFront(3));
        System.out.println(Arrays.toString(myQueue.array));

        System.out.println(myQueue.insertFront(4));
        System.out.println(Arrays.toString(myQueue.array));

        System.out.println(myQueue.getRear());
        System.out.println(Arrays.toString(myQueue.array));

        System.out.println(myQueue.isFull());
        System.out.println(Arrays.toString(myQueue.array));

        System.out.println(myQueue.deleteLast());
        System.out.println(Arrays.toString(myQueue.array));

        System.out.println(myQueue.insertFront(4));
        System.out.println(Arrays.toString(myQueue.array));

        System.out.println(myQueue.getFront());
        System.out.println(Arrays.toString(myQueue.array));
    }
}
