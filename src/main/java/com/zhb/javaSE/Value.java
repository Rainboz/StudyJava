package com.zhb.javaSE;

class Value{
    int i = 15;
}
class Test{
    public static void main(String argv[]) {
        Test t = new Test();//加载Test.class进内存，声明Test类型引用t，在堆内存创建对象，默认初始化赋值，显示初始化赋值，构造方法进栈执行对象的属性赋值之后弹栈，最后将对象地址赋值给引用t。
        t.first();
    }
    public void first() {
        int i = 5;
        Value v = new Value();
        v.i = 25;
        second(v, i);
        System.out.println(v.i);
    }
    public void second(Value v, int i) {
        i = 0;
        v.i = 20;
        Value val = new Value();
        v = val;
        System.out.print(v.i + " " + i);
    }
}