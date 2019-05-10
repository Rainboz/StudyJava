package com.zhb.javaSE.package201905.in_class_out_class;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-10 09:08
 **/
public class Extends_out_in_class extends OutClass.InClass {
   //必须硬性给予这个类一个带参数的构造方法，并且该构造方法的参数为需要继承内部类的外部类的引用
    public Extends_out_in_class(OutClass a) {
        a.super();//需要继承内部类的外部类的引用对象.super();”语句，这样才为继承提供了必要的对象引用。
    }
    public void test(){
        super.test();
        System.out.println("我是继承外部类的内部类重写的方法！");
    }
    public static void main(String[] args) {
        //1
        OutClass o = new OutClass();
        Extends_out_in_class e = new Extends_out_in_class(o);
        e.test();
        System.out.println("---------------------------------------------");
        //2
        OutClass.InClass oe = o.new EinClass();
        oe.test();
    }
}
