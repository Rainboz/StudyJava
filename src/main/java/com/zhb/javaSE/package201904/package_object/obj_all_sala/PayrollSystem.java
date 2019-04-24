package com.zhb.javaSE.package201904.package_object.obj_all_sala;

import java.util.Scanner;

/**
 * @program: StudyJava
 * @description: 建Employee变量数组并初始化，该数组存放各类雇员对象的引用。利用循环结构遍历数组元素，输出各个对象的类型,name,number,birthday,以及该对象生日。当键盘输入本月月份值时，如果本月是某个Employee对象的生日，还要输出增加工资信息。
 * @author: rainboz
 * @create: 2019-04-24 23:29
 **/
public class PayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employees[] = new Employee[5];
        employees[0] = new HourlyEmployee("祝海波", 15905139, new MyDate(4, 24, 2019), 50, 224);
        employees[1] = new HourlyEmployee("徐子鹏", 15905115, new MyDate(4, 25, 2020), 49, 192);
        employees[2] = new HourlyEmployee("张中国", 15905114, new MyDate(4, 23, 2018), 48, 224);
        employees[3] = new SalariedEmployee("朱方安", 15905114, new MyDate(4, 23, 2019), 10000);
        employees[4] = new SalariedEmployee("朱葛", 15905114, new MyDate(4, 24, 2018), 10000);

        System.out.println("输入本月月份值: ");
        int in_mouth = sc.nextInt();

        for (Employee x : employees) {
            System.out.println("员工：" + x);
            if (in_mouth == x.getBirthday().getMonth()) {
//                x.earnings();
                System.out.println(x.getName() + "生日为: " + in_mouth + "月，加薪100,该月月薪为：" + (x.earnings() + 100) + "元\n");
            }
        }

    }
}
