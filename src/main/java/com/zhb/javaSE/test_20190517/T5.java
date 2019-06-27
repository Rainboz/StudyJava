package com.zhb.javaSE.test_20190517;

import java.util.Random;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 19-5-17 下午12:24
 **/
public class T5 implements Runnable {
    public int account =1000;

    @Override
    public void run() {
        Random random=new Random();
        int a=random.nextInt(1000);
        synchronized (this) {
            while(true)
                if(account>=a) {
                    account-=a;
                    System.out.println(Thread.currentThread().getName()+"-----"+"取出了"+a+"元"+",还剩"+account+"元");
                }else {
                    System.out.println(Thread.currentThread().getName()+"-----"+"取款失败！余额不足，你准备取款"+a+"元，实际余额"+account+"元");
                    break;
                }
        }

    }
    public static void main(String[] args) {
        T5 a=new T5();
        Thread t1=new Thread(a);
        Thread t2=new Thread(a);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}

