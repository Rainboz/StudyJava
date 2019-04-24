package com.zhb.javaSE.package201904.package_object.obj_all_sala;

/**
 * @program: StudyJava
 * @description: 实现按月计算工资的员工处理。
 * @author: rainboz
 * @create: 2019-04-24 23:15
 **/
public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, int number, MyDate mydate, double monthlySalary) {
        super(name, number, mydate);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
//        return "SalariedEmployee{" +
//                "monthlySalary=" + monthlySalary +
//                '}';
        return "Employee" + "{name: " + super.getName() +
                " number: " + super.getNumber() +
                " "+super.getBirthday().toDateString() + "}";
    }
}
