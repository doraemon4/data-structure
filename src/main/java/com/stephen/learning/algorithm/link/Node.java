package com.stephen.learning.algorithm.link;

import lombok.Data;

/**
 * @Auther: jack
 * @Date: 2018/10/14 13:05
 * @Description: 链表节点
 */
public class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public void addNode(Node<T> node) {
        if (this.next == null) {
            this.next = node;
        } else {
            this.next.addNode(node);
        }
    }

    public void printNode() {
        System.out.println(this.data);
        if (this.next != null) {
                this.next.printNode();
        }
    }
}

@Data
class Link<T> {
    /**
     * 根结点
     */
    private Node root;
    /**
     * 尾节点
     */
    private Node last;

    /**
     * 添加节点信息
     *
     * @param data
     */
    public void add(T data) {
        Node node = new Node(data);
        if (this.root == null) {
            root = node;
            last = node;
        } else {
            root.addNode(node);
            last = node;
        }
    }

    /**
     * 打印出节点信息
     */
    public void printNode() {
        if (root != null) {
            root.printNode();
        }
    }

    /**
     * 递归反转(A->B->C->D->E 反转后 A<-B<-C<-D<-E)
     * @param node
     */
    public Node reverse(Node node){
        if(node==null||node.next==null){
            return node;
        }
        Node head=reverse(node.next);
        node.next.next=node;
        node.next=null;
        return head;
    }
}