package com.zhb.javaSE.package201905.rk2016;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-13 19:48
 **/
public class FootDecorator extends Decorator {
    public FootDecorator(Invoice t) {
        super(t);
    }
    public void p(){
        //(3)
        ticket.p();
        System.out.println("footer");
    }
}
