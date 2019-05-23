package com.zhb.javaSE.package201905.in_class_out_class;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-10 09:07
 **/
public class OutClass {
    public void test(){
        System.out.println("我是外部类的方法！");
    }
    public class InClass{
        public void test(){
            System.out.println("我是外部类的内部类的方法！");
        }
    }
    class EinClass extends InClass implements Runnable{
        public void test(){
            super.test();
            System.out.println("我是外部类的内部类的子类的重写方法！");
        }

        @Override
        public void run() {

        }
    }
}
