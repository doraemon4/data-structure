package com.stephen.learning.algorithm.tree;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: jack
 * @Date: 2018/10/15 12:00
 * @Description:
 */
public class TestBinaryTree {
    /**
     * 测试二叉树的  创建、遍历
     * 二叉树结构如下
     *            A
     *       B         C
     *    D     E   F     G
     *  H   I        J
     */
    @Test
    public void test(){
        LinkedList<Character> tree=new LinkedList();
        tree.add('A');tree.add('B');tree.add('D');
        tree.add('H');tree.add(null);tree.add(null);
        tree.add('I');tree.add(null);tree.add(null);
        tree.add('E');tree.add(null);tree.add(null);
        tree.add('C');tree.add('F');tree.add(null);
        tree.add('J');tree.add(null);tree.add(null);
        tree.add('G');tree.add(null);tree.add(null);
        BinaryTree<Character> binaryTree=new BinaryTree<Character>();
        //创建二叉树
        BinaryTree.TreeNode root=binaryTree.creatBinaryPre(tree);
        //先序遍历
        System.out.println("先序遍历：");
        binaryTree.traverseBinaryPre(root);
        System.out.println();
        //中序遍历
        System.out.println("中序遍历：");
        binaryTree.traverseBinaryMid(root);
        System.out.println();
        //后序遍历
        System.out.println("后序遍历：");
        binaryTree.traverseBinarySuf(root);
        System.out.println();
    }

    @Test
    public void traverseBinaryTopToBottom(){
        LinkedList<Character> tree=new LinkedList();
        tree.add('A');tree.add('B');tree.add('D');
        tree.add('H');tree.add(null);tree.add(null);
        tree.add('I');tree.add(null);tree.add(null);
        tree.add('E');tree.add(null);tree.add(null);
        tree.add('C');tree.add('F');tree.add(null);
        tree.add('J');tree.add(null);tree.add(null);
        tree.add('G');tree.add(null);tree.add(null);
        BinaryTree<Character> binaryTree=new BinaryTree<Character>();
        //创建二叉树
        BinaryTree.TreeNode root=binaryTree.creatBinaryPre(tree);
        List<Character> list=binaryTree.traverseBinaryTopToBottom(root);
        System.out.println(list);
    }
}
