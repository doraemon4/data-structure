package com.stephen.learning.algorithm.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Auther: jack
 * @Date: 2018/10/30 17:42
 * @Description: 通过两个队列实现栈(leetcode算法题库225）
 */
public class MyStack {
    private Queue<Integer> firstQueue;
    private Queue<Integer> secondQueue;

    /** Initialize your data structure here. */
    public MyStack() {
        this.firstQueue=new LinkedList<>();
        this.secondQueue=new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        firstQueue.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (firstQueue.size()!=1){
            int num=firstQueue.poll();
            secondQueue.add(num);
        }
        int pop=firstQueue.poll();
        //队列交换
        Queue<Integer> temp=firstQueue;
        firstQueue=secondQueue;
        secondQueue=temp;
        return pop;
    }

    /** Get the top element. */
    public int top() {
        while (firstQueue.size()!=1){
            int num=firstQueue.poll();
            secondQueue.add(num);
        }
        return firstQueue.element();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return secondQueue.isEmpty()&&firstQueue.isEmpty();
    }
}
