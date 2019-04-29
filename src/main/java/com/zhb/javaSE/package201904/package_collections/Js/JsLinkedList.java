package com.zhb.javaSE.package201904.package_collections.Js;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-28 22:38
 **/
public class JsLinkedList {
    public static void main(String[] args) {
        int N = 15;// 这个表示总人数
        int M = 7;// 数到几的人出列
        Node t = new Node(1);// 头节点单列出来，方便形成循环链表
        Node x = t;

        for (int i = 2; i <= N; i++)
            x = (x.next = new Node(i));// 建立单向链表
        x.next = t;// 最后一个节点的next指向第一个节点，形成循环链表
        System.out.println("出圈的顺序为：");
        while (x != x.next) {
            for (int i = 1; i < M; i++)
            {x = x.next;}//头结点指向第一个数，头删除
            // 此时x是将出列的节点的前一个节点
            System.out.print(x.next.val + " ");//输出第一个数的后一个
            x.next = x.next.next;//X的next域指向X后继的后继，删除X的后继
        }
        System.out.println();
        System.out.println("Survivors is " + x.val);
    }
}
