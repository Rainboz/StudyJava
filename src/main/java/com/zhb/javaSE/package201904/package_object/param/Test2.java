package com.zhb.javaSE.package201904.package_object.param;

/**
 * @program: StudyJava
 * @description: a
 * @author: rainboz
 * @create: 2019-04-19 19:04
 **/
class Value {
    int i = 15;
}

class Test2 {
    public static void main(String argv[]) {
        Test2 t = new Test2();
        t.first();
    }

    public void first() {
        int i = 5;
        Value v = new Value();
        v.i = 25;
        second(v, i);
        System.out.println(v.i + " ");//20
    }

    public void second(Value v, int i) {
        i = 0;
        v.i = 20;
        Value val = new Value();
        v = val;
        System.out.print(v.i + " " + i + " ");//20 0
    }
}
