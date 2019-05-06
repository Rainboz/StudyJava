package com.zhb.javaSE.package201904.package_object.final_static_test;

/**
 * @program: StudyJava
 * @description:用final来修饰属性，方法，类，总结出final的用法；
 * @author: rainboz
 * @create: 19-4-22 下午7:13
 **/
public class Test {
    static int A = 10;
    int b = 5;
    static String name = "zhb";
    String name2 = "zg";

    /**
     * @Description //TODO 1、修饰类 当用final修饰一个类时，表明这个类不能被继承。也就是说，如果一个类你永远不会让他被继承，就可以用final进行修饰。2、修饰方法  因为重写的前提是子类可以从父类中继承此方法，如果父类中final修饰的方法同时访问控制权限为private，将会导致子类中不能直接继承到此方法，因此，此时可以在子类中定义相同的方法名和参数，此时不再产生重写与final的矛盾，而是在子类中重新定义了新的方法。父类的final方法是不能被子类所覆盖的，也就是说子类是不能够存在和父类一模一样的方法的。3、修饰变量  当final修饰一个基本数据类型时，表示该基本数据类型的值一旦在初始化后便不能发生变化；如果final修饰一个引用类型时，则在对其初始化之后便不能再让其指向其他对象了，但该引用所指向的对象的内容是可以发生变化的。　final修饰一个成员变量（属性），必须要显示初始化。这里有两种初始化方式，一种是在变量声明的时候初始化；第二种方法是在声明变量的时候不赋初值，但是要在这个变量所在的类的所有的构造函数中对这个变量赋初值。
     **/
    static final class A {
        int a = 1;

        void methodA() {
            System.out.println("AAAAAA");
        }
    }

    public static void main(String[] args) {
        A a = new A();
        a.methodA();
        System.out.println(A);
        System.out.println(new Test().b);

        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        name = "zfa";
        t1.name2 = "zhb";
        t2.name="12";
        System.out.println(t2.name);
        System.out.println("t1.name2: "+t1.name2);
        System.out.println("t2.name2: "+t2.name2);
        System.out.println("t3.name2: "+t3.name2);
        System.out.println("static name: "+name);
    }
}

