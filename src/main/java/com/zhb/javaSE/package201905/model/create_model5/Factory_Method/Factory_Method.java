package com.zhb.javaSE.package201905.model.create_model5.Factory_Method;

/**
 * @program: StudyJava
 * @description: 定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
 * @author: rainboz
 * @create: 2019-05-14 09:42
 **/
public class Factory_Method {
    public static void main(String[] args) {
        AnimalsFactory af = new AnimalsFactory();
        //通过动物工厂new实现类,工厂模式让Animal接口创建过程延迟到子类进行
        Animals dog = af.getAnimals("dog");
        Animals cat = af.getAnimals("cat");
        dog.name();
        cat.name();
        //声明接口new实现类  多态
        Animals a1 = new Cat();
        Animals a2 = new Dog();
        a1.name();
        a2.name();
    }
}

//动物工厂
class AnimalsFactory {
    public Animals getAnimals(String name) {
        if (name.equalsIgnoreCase("cat"))
            return new Cat();
        else if (name.equalsIgnoreCase("dog"))
            return new Dog();
        else
            return null;
    }
}

interface Animals {//动物

    void name();
}

class Cat implements Animals {

    @Override
    public void name() {
        System.out.println("this is a cat");
    }
}

class Dog implements Animals {

    @Override
    public void name() {
        System.out.println("this is a dog");
    }
}
