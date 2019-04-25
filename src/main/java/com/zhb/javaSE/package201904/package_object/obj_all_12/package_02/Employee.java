package com.zhb.javaSE.package201904.package_object.obj_all_12.package_02;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-25 10:56
 **/
public class Employee extends Person{
    private String office;
    private double wage;
    private String hiredate;

    public Employee() {
    }

    public Employee(String name, String address, String telphone, String email, String office, double wage, String hiredate) {
        super(name, address, telphone, email);
        this.office = office;
        this.wage = wage;
        this.hiredate = hiredate;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    //输出其对象
   /* 姓名：张三
    学位：硕士 级别：讲师
    工资：B2 工作时间：2002年8月
    地址：青岛大学 办公室：博学楼404
    电话：0532-85958888
    电子邮件：zhang3@qdu.edu.cn*/
    public void shuchu() {
//        System.out.println("办公室：\n"+office);
//        System.out.println("地址：\n"+wage);
//        System.out.println("电话：\n"+hiredate);
//        System.out.print("工资："+wage);
//        System.out.println("工作时间："+hiredate);
    }
}
