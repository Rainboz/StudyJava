package com.zhb.javaSE.package201904.package_object.obj_all_extends_11;

/**
 * @program: StudyJava
 * @description: 子类 Worker继承自Employee  属性：char category;//类别 boolean dressAllowance; //是否提供服装津贴 ， 有一个构造方法 负责构造所有属性，还有一个自定义方法 isDressAll() 这个方法 负责通过判断dressAllowance的值输出 ，是否提供服装津贴。
 * @author: rainboz
 * @create: 2019-04-25 10:36
 **/
public class Worker extends Employee {
    private char category;
    boolean dressAllowance;

    public Worker(String name, char sex, char category, boolean dressAllowance) {
        super(name, sex);
        this.category = category;
        this.dressAllowance = dressAllowance;
    }

    public boolean isDressAll() {
        /**
         *功能描述 @description: TODO 负责通过判断dressAllowance的值输出 ，是否提供服装津贴。
         * @date 19-4-25 上午10:38
         * @param []
         * @return boolean
         */
        if (category == '0') {
            dressAllowance = false;
            System.out.println("不提供津贴");
        } else {
            dressAllowance = true;
            System.out.println("提供津贴");
        }
        return dressAllowance;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + super.getName() + '\'' +
                ", sex=" + super.getSex() +
                " Worker[" +
                "category=" + category +
                ", dressAllowance=" + dressAllowance +"]"+
                '}';
    }
}
