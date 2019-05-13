package com.zhb.javaSE.package201905.rk2016;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-13 19:44
 **/
public class Decorator extends Invoice{
    protected Invoice ticket;

    public Decorator(Invoice t) {
        ticket = t;
    }
    public void p(){
        if (ticket != null){
            //(1)
            ticket.p();
        }
    }
}
