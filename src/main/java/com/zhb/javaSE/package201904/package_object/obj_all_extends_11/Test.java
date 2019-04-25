package com.zhb.javaSE.package201904.package_object.obj_all_extends_11;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-25 10:22
 **/
public class Test {

    public static void main(String[] args) {
        //01
        Student student = new Student("zhb", 12, "男");
        Person student2 = new Student("ZFA", 23, "男");
        System.out.println(student);
        System.out.println(student2);
        //03
        A a = new B();
        a.eat();
        a.sleep();
        A a2 = new C();
        a2.eat();
        a2.sleep();
        //04
        Worker worker = new Worker("zhb", '男', '1', false);
        System.out.println(worker);
        worker.isDressAll();
        Worker worker2 = new Worker("zhb", '男', '0', false);
        System.out.println(worker2);
        worker2.isDressAll();
    }
}
