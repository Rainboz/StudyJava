package com.zhb.javaSE.package201905.rk2016;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-13 19:48
 **/
public class Test {
    public static void main(String[] args) {
        Invoice t = new Invoice();
        Invoice ticket;
        //(4)
        ticket = new FootDecorator(new HeadDecorator(t));
        ticket.p();
        System.out.println("--------------------------");
        //(5)
        ticket =new FootDecorator (new HeadDecorator(new Decorator(null)));
        ticket.p();
    }
}
