package com.zhb.javaSE.toObj.duotai;

public class Dog extends Animal{
    protected void  eat(){
        System.out.println("Dog子类");
    }
    protected void method1(double a,double b){
       super.method1(1,2);
        System.out.println(a+" * "+b+" = "+a*b);
    }
    /**
     * @Author rainboz
     * @Description //TODO 
     * @Date 下午1:48 19-4-22
     * @Param [a, b]
     * @return void
     **/
    protected void method2(double a,double b){
        super.method2(1,2);
        System.out.println(a+" / "+b+" = "+a/b);
    }

    protected Dog run(){
        System.out.println("返回值类型String报错");
        return null;
    }
}
