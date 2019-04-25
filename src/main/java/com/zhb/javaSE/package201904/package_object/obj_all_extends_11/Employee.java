package com.zhb.javaSE.package201904.package_object.obj_all_extends_11;

/**
 * @program: StudyJava
 * @description: 属性：name、sex ， 带一个构造方法Employee(String n, char s)
 * @author: rainboz
 * @create: 2019-04-25 10:34
 **/
public class Employee {
    private String name;
    private char sex;

    public Employee() {
    }

    public Employee(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}
