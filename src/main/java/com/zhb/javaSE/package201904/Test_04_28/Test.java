package com.zhb.javaSE.package201904.Test_04_28;


/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-28 09:19
 **/
public class Test {
    public static void main(String[] args) {

        try {
            Fruit a = new Apple();
            method(a);
        }catch (Exception e){

        }
        finally {

        }

    }
    public static void method(Fruit a){
        if (a instanceof Apple){
            Apple apple = (Apple) a;
            apple.dance();
        }
        if (a instanceof Pear){
            Pear pear = (Pear) a;
            pear.dance();
        }
        if ( a instanceof Banana){
            Banana banana = (Banana) a;
            banana.dance();

        }
    }
}
