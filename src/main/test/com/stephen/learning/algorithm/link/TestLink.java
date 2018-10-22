package com.stephen.learning.algorithm.link;

import org.junit.Test;

/**
 * @Auther: jack
 * @Date: 2018/10/14 13:27
 * @Description:
 */
public class TestLink {
    public static void main(String[] args) {
        Link<String> link = new Link();
        link.add("jack");
        link.add("peter");
        link.add("alice");
        link.add("jenny");
        link.add("bob");
        link.printNode();

        Link<Integer> nums = new Link();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.printNode();
    }

    @Test
    public void reverse(){
        Link<String> link = new Link();
        link.add("A");
        link.add("B");
        link.add("C");
        link.add("D");
        link.add("E");
        link.printNode();
        System.out.println("反转之后：");
        link.reverse(link.getRoot()).printNode();
    }
}
