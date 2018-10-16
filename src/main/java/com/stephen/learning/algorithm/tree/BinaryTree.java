package com.stephen.learning.algorithm.tree;


import lombok.ToString;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Auther: jack
 * @Date: 2018/10/15 11:19
 * @Description:  二叉树的遍历(递归实现)
 */
public class BinaryTree<T> {

    /**
     * 先序创建二叉树
     * @param treeData
     * @return
     */
    public TreeNode<T>  creatBinaryPre(LinkedList<T> treeData)
    {
        TreeNode<T> root=null;
        T data=treeData.removeFirst();
        if (data!=null)
        {
            root=new TreeNode<T>(data, null, null);
            root.left=creatBinaryPre(treeData);
            root.right=creatBinaryPre(treeData);
        }
        return root;
    }

    /**
     * 先序遍历
     * @param root
     */
    public void traverseBinaryPre(TreeNode<T> root){
        if(root!=null){
            System.out.print(root.data);
            traverseBinaryPre(root.left);
            traverseBinaryPre(root.right);
        }
    }

    /**
     * ˙中序遍历
     * @param root
     */
    public void traverseBinaryMid(TreeNode<T> root){
        if(root!=null){
            traverseBinaryMid(root.left);
            System.out.print(root.data);
            traverseBinaryMid(root.right);
        }
    }

    /**
     * 后序遍历
     * @param root
     */
    public void traverseBinarySuf(TreeNode<T> root){
        if(root!=null){
            traverseBinarySuf(root.left);
            traverseBinarySuf(root.right);
            System.out.print(root.data);
        }
    }

    @ToString
    public class TreeNode<T>{
        private T data;
        private TreeNode<T> left;
        private TreeNode<T> right;
        TreeNode(T data,TreeNode<T> left,TreeNode<T> right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }

    /**
     * 从上往下打印二叉树
     * @param root
     * @return
     */
    public List<T> traverseBinaryTopToBottom(TreeNode<T> root){
        List<T> list=new ArrayList<T>();
        if(root==null){
            return Collections.EMPTY_LIST;
        }
        Queue<TreeNode<T>> queue=new LinkedBlockingQueue<TreeNode<T>>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode<T> node=queue.poll();
            list.add(node.data);
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
        return list;
    }
}


