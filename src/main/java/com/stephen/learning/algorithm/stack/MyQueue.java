package com.stephen.learning.algorithm.stack;

import java.util.Stack;

/**
 * @Auther: jack
 * @Date: 2018/10/30 17:43
 * @Description: 通过两个栈实现一个队列(leetcode算法题库232）
 */
public class MyQueue {
    private Stack<Integer> firstStack;
    private Stack<Integer> secondStack;
    /** Initialize your data structure here. */
    public MyQueue() {
        firstStack=new Stack<>();
        secondStack=new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while (!secondStack.empty()){
            firstStack.push(secondStack.pop());
        }
        firstStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (!firstStack.empty()){
            secondStack.push(firstStack.pop());
        }
        return secondStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        while (!firstStack.empty()){
            secondStack.push(firstStack.pop());
        }
        return secondStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return secondStack.empty()&&firstStack.empty();
    }
}
