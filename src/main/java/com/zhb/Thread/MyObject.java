package com.zhb.Thread;

/**
 * @program: StudyJava
 * @description: ${description}
 * @author: ls
 * @create: 2018-09-03 17:19
 */
public class MyObject {
    synchronized public void mA(){
        System.out.println("MA");
    }
    synchronized public void mB(){
        System.out.println("MB");
    }
    public static class ThreadA extends Thread{
        private MyObject myObject;

        public ThreadA(MyObject myObject) {
        }

        @Override
        public void run(){
            super.run();
            myObject.mA();
        }
    }
    public static class ThreadB extends Thread{
        private MyObject myObject;

        public ThreadB(MyObject myObject) {

        }

        @Override
        public void run(){
            super.run();
            myObject.mB();
        }
    }
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        Thread a = new ThreadA(myObject);
        Thread b = new ThreadB(myObject);
        a.start();b.start();
    }
}

