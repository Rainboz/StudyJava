package com.zhb.javaSE.package201904.package_object.obj_all_12.package_02;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-25 10:57
 **/
public class Faculty extends Employee {
    private String degree;
    private String level;

    public Faculty() {
    }

    public Faculty(String name, String address, String telphone, String email, String office, double wage, String hiredate, String degree, String level) {
        super(name, address, telphone, email, office, wage, hiredate);
        this.degree = degree;
        this.level = level;
    }

    /* 姓名：张三
            学位：硕士 级别：讲师
            工资：B2 工作时间：2002年8月
            地址：青岛大学 办公室：博学楼404
            电话：0532-85958888
            电子邮件：zhang3@qdu.edu.cn*/
    public void shuchu() {
        System.out.print("学位："+degree);
        System.out.println("级别："+level);

        System.out.print("工资："+super.getWage());
        System.out.println("工作时间："+super.getHiredate());

        System.out.print("地址："+super.getAddress());
        System.out.println("办公室："+super.getOffice());

        System.out.println("电话："+super.getTelphone());
        System.out.println("电子邮件："+super.getEmail());
    }
}
