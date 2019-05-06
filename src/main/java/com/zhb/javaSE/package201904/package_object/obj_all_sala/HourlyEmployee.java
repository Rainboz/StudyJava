package com.zhb.javaSE.package201904.package_object.obj_all_sala;

/**
 * @program: StudyJava
 * @description: 现按小时计算工资的员工处理。
 * @author: rainboz
 * @create: 2019-04-24 23:24
 **/
public class HourlyEmployee extends Employee {
    private double wage;
    private double hour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, double hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage * hour;
    }

    @Override
    public String toString() {
//        return "HourlyEmployee{" +
//                "wage=" + wage +
//                ", hour=" + hour +
//                '}';
        return "Employee" + "{name: " + super.getName() +
                " number: " + super.getNumber() +
                " "+super.getBirthday().toDateString() + "}";
    }
}
