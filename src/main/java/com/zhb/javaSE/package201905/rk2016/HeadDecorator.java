package com.zhb.javaSE.package201905.rk2016;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-13 19:46
 **/
public class HeadDecorator extends Decorator {

    public HeadDecorator(Invoice t) {
        super(t);
    }
    public void p(){
        System.out.println("header");
        //(2)
        ticket.p();
    }
}
