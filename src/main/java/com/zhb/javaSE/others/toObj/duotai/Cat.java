package com.zhb.javaSE.toObj.duotai;

public class Cat extends Animal{
    private int b;
    private int a;
    public Cat() {
    }

    public Cat(int a, int b) {
        super(a);
        this.b = b;
    }

    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    protected int run0(){
        System.out.println("子类返回值类型int");
        return 0;
    }
    protected Cat  run(){
        super.run();
        System.out.println("子类返回值类型int");
        return null;
    }
    @Override
    protected void  eat(){
        super.eat();
        System.out.println("Cat子类");
    }
   //重载父类方法
    protected void eat(String e){
        System.out.println("重载父类eat方法");
    }
    protected void NewMethod(){
        System.out.println("调用子类新增方法");
    }
    //重写父类run方法
    /*protected String run(){
        System.out.println("返回值类型String报错");
        return "";
    }*/

    protected int run2(int a){
        System.out.println("返回值类型int,父类final修饰");
        return 0;
    }
    protected static int run3(){
        System.out.println("子类返回值类型int,static修饰");
        return 0;
    }
}
