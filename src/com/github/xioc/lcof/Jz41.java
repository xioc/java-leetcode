package com.github.xioc.lcof;

import java.util.*;

/**
 * @author huyanglin
 * @date 2020/9/4 19:38
 */
public class Jz41 {
    /**
     * private List<Integer> data = new ArrayList<>();
     * <p>
     * public Jz41() {
     * data = new ArrayList<>();
     * }
     * <p>
     * public void addNum(int num) {
     * data.add(num);
     * Collections.sort(data);
     * }
     * <p>
     * public double findMedian() {
     * int l = data.size();
     * if (l % 2 == 1) {
     * return data.get(l / 2);
     * } else {
     * int res = data.get(l / 2) + data.get(l / 2 - 1);
     * return res / 2.0;
     * }
     * }
     */


    Queue<Integer> bigRoot, smallRoot;

    public Jz41() {


        //大顶堆
        bigRoot = new PriorityQueue<>(((o1, o2) -> {
            return o2 - o1;
        }));

        smallRoot = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if(bigRoot.size()==smallRoot.size()){
            bigRoot.add(num);
            smallRoot.add(bigRoot.poll());
        }else {
            smallRoot.add(num);
            bigRoot.add(smallRoot.poll());
        }
    }

    public double findMedian() {
        if(bigRoot.size()==smallRoot.size()){
            return (bigRoot.peek()+smallRoot.peek())/2.0;
        }
        return smallRoot.peek();
    }

}
