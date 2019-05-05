package com.zhb.javaSE.package201904.package_object.extends_test;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 19-4-22 下午10:15
 **/
public class C {
    private int c_field;

    public C() {
        System.out.println("C");
    }
    public final void sc(){}

    public static void main(String[] args) {
        C c = new C();
        System.out.println();
        A a = new A();
        System.out.println();
        B b = new B();
    }

}

