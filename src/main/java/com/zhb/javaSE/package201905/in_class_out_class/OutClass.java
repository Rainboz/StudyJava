package com.zhb.javaSE.package201905.in_class_out_class;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-10 09:07
 **/
public class OutClass {
    String str1 = "o--str1";
    public void test() {
        System.out.println(str1);
        System.out.println("我是外部类的方法！");
    }

    public class InClass {
        String str1 = "i---str1";

        public void test() {
            System.out.println(OutClass.this.str1);
            System.out.println("我是外部类的内部类的方法！");
        }
    }

    class EinClass extends InClass implements Runnable {
        String str1 = "ec---str1";

        public void test() {
            //super.test();
            System.out.println(str1);
            System.out.println("我是外部类的内部类的子类的重写方法！");
        }

        @Override
        public void run() {

        }
    }

    public static void main(String[] args) {
        OutClass o = new OutClass();
        InClass i = o.new InClass();
        i.test();
        EinClass ec = o.new EinClass();
        ec.test();
    }
}
