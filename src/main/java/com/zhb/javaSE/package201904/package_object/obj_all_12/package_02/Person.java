package com.zhb.javaSE.package201904.package_object.obj_all_12.package_02;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-25 10:56
 **/
public class Person {
    private String name;
    private String address;
    private String telphone;
    private String email;

    public Person() {
    }

    public Person(String name, String address, String telphone, String email) {
        this.name = name;
        this.address = address;
        this.telphone = telphone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //输出其对象
      /* 姓名：张三
    学位：硕士 级别：讲师
    工资：B2 工作时间：2002年8月
    地址：青岛大学 办公室：博学楼404
    电话：0532-85958888
    电子邮件：zhang3@qdu.edu.cn*/
    public void shuchu() {
        System.out.println("姓名：\n"+name);
//        System.out.print(" 地址："+address);
//        System.out.println("地址：\n"+address);
//        System.out.println("电话：\n"+telphone);
//        System.out.println("电子邮件：\n"+email);

    }
}
