package com.zhb.javaSE.package201905.model;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-14 09:24
 **/
public class STest {
    public static void main(String[] args) {
        /*
            创建唯一对象,使用null，获取唯一对象时new Instance();s1,s2修改i值互不影响，说明创建了两个对象
            1.可以在创建唯一对象时private static Singleton instance = new Instance();保证唯一对象，即只能实例化一次。
            以上1为饿汉式，但容易产生垃圾对象。

            2.将变量i改成static，所有对象共享一个变量副本，但还是没有解决单例问题

            3. 创建唯一对象使用private static Singleton instance = null;时为懒汉式,线程不安全
            需要在获取唯一对象时判断instance是否为null，  if (instance == null)instance = new Singleton();
            4.懒汉式,线程安全，在获取唯一对象方法加synchronized关键字。

            5.如果涉及到反序列化创建对象时，可以尝试使用第 5 种枚举方式。
            public enum Singleton {
                INSTANCE;
                public void whateverMethod() {
                }
            }
            总结：不建议使用第 3 种和第 4 种懒汉方式，建议使用第 1 种饿汉方式。
         */
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s2.setI(45);
        s1.setI(6);
        System.out.println("s1:" + s1.getI() + " s2: " + s2.getI());

    }

}
