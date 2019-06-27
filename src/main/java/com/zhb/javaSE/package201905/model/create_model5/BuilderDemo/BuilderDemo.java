package com.zhb.javaSE.package201905.model.create_model5.BuilderDemo;

/**
 * @program: StudyJava
 * @description: 将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。将一些不会变的基本组件，通过builder，组合，构建复杂对象，实现分离
 * @author: rainboz
 * @create: 2019-05-14 10:41
 **/
public class BuilderDemo {
    public static void main(String[] args) {
        PriceBuilder priceBuilder = new PriceBuilder();
        System.out.println("Car1和Car2:"+priceBuilder.Car1AndCar2());
        System.out.println("Car1和Bus:"+priceBuilder.Car1AndBus());
    }
}
//基本组件
interface Car {
}
//基本组件1
class Car1 implements Car{
    int price = 20;
}
//基本组件2
class Car2 implements Car{
    int price = 90;
}
//基本组件3
class Bus {
    int price = 500;
}
class PriceBuilder {
    //car1和car2的总价格
    public int Car1AndCar2() {
        int priceOfCar1 = new Car1().price;
        int priceOfCar2 = new Car2().price;
        return priceOfCar1+priceOfCar2;
    }
    //car1和bus的总价格
    public int Car1AndBus() {
        int priceOfCar1 = new Car1().price;
        int priceOfBus = new Bus().price;
        return priceOfCar1+priceOfBus;
    }
}
