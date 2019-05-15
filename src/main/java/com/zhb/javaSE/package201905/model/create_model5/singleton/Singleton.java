package com.zhb.javaSE.package201905.model.create_model5.singleton;

/**
 * @program: StudyJava
 * @description: 在类内部创造单一对象，通过设置构造方法权限，使类外部无法再创造对象
 * @author: rainboz
 * @create: 2019-05-14 10:07
 **/
public class Singleton {
    public static void main(String[] args) {
        Earth e = Earth.getInstance();
        Earth e2 = Earth.getInstance();
        e2.setAge(12);
        e.setAge(402);
        System.out.println("年龄: "+e.getAge()+" 年龄2: "+e2.getAge());
    }
}

//创建单例对象的方式有多种，下面是比较常用的一种方式；按需求选择合适方式。
class Earth {//只允许创建一个对象的类
    //创建唯一对象
    private static Earth instance = new Earth();

    //构造函数访问权限必须private
    private Earth() {
    }

    //获取唯一对象
    public static Earth getInstance() {
        return instance;
    }

    private int age = 1000;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
