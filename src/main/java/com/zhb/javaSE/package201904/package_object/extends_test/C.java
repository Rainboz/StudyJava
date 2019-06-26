package com.zhb.javaSE.package201904.package_object.extends_test;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 19-4-22 下午10:15
 **/
public class C extends B {
    private int c_field;

    public C() {
        System.out.println("C");
    }

    public final void sc() {
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println();
        B b = new B();
        System.out.println();
        C c = new C();

        A a1 = new B();

        if (a1 instanceof B){
            B b1 = (B) a1;
            b1.sc(2);
            System.out.println("a1对象类型是B");
        }
        if (b instanceof C){
            C c1 = (C) b;
            c1.sc();
        }else {
            System.out.println("b对象类型不是C");
        }

    }

}

