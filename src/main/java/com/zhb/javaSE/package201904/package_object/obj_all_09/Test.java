package com.zhb.javaSE.package201904.package_object.obj_all_09;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-23 19:28
 **/
public class Test {
    @org.junit.Test
    public void testStudent(){
        Student student = new Student("祝海波",23,"男",97,70,223,103,99);
        System.out.println(student.avg());
    }
}
