package com.zhb.javaSE.package201904.package_object.obj_all_sala;

/**
 * @program: StudyJava
 * @description: 编写工资系统，实现不同类型员工(多态)的按月发放工资。如果当月出现某个Employee对象的生日，则将该雇员的工资增加100元。
 * @author: rainboz
 * @create: 2019-04-24 23:07
 **/
public abstract class Employee {
    private String name;
    private int number;
    private MyDate mydate;
    abstract void earnings();
}
