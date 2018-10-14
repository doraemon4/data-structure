package com.stephen.learning.algorithm.recursive;

import org.junit.Test;

/**
 * @Auther: jack
 * @Date: 2018/10/14 18:35
 * @Description: 递归的使用
 * 1. 递归函数适合递归深度不高的情形，当深度过高，空间复杂度过大，容易造成函数栈溢出:StackOverflowError
 * 2. 函数要考虑它的时间复杂度和空间复杂度
 */
public class RecursiveUse {
    /**
     * 斐波那契数列Fibonacci：兔子问题
     * @param n
     */
    public int fab(int n){
        if(n==1||n==2){
            return 1;
        }else{
            return fab(n-1)+fab(n-2);
        }
    }

    /**
     * 阶乘计算
     * @param n
     * @return
     */
    public int fac(int n){
        if(n==1){
            return 1;
        }else{
            return n*fac(n-1);
        }
    }


    @Test
    public void testFab(){
        System.out.println(fab(100));
    }

    @Test
    public void testFac(){
        System.out.println(fac(6));
    }
}
