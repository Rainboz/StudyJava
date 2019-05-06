package com.zhb.javaSE.package201904.package_object.test1_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-23 11:35
 **/
public class Test {
    /**
     * 创建该类的 5 个对象，并把这些对象放入 TreeSet 集合中（TreeSet 需使用泛型来定义），
     * 分别按以下两种方式对集合中的元素进行排序，并遍历输出：
     * <p>
     * 1). 使Employee 继承 Comparable 接口，并按 name 排序
     * 2). 创建 TreeSet 时传入 Comparator对象，按生日日期的先后排序。
     */
    /**
     * name排序
     */
    @org.junit.Test
    public void test1() {
        Comparator comparator = new Comparator() {
            /**
             * @description: 比较其两个参数的顺序。 返回负整数，零或正整数，因为第一个参数小于，等于或大于第二个参数。
             * @param o1
             * @param o2
             * @return
             */
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof Employee) {
                    Employee c1 = (Employee) o1;
                    Employee c2 = (Employee) o2;
                    if (c1.getBirthday().getYear() == c2.getBirthday().getYear()) {
                        if (c1.getBirthday().getMonth() == c2.getBirthday().getMonth()) {
                            if (c1.getBirthday().getDay() == c2.getBirthday().getDay()) {
                                return 0;
                            } else if (c1.getBirthday().getDay() > c2.getBirthday().getDay()) {
                                return -1;
                            } else {
                                return -1;
                            }
                        } else if (c1.getBirthday().getMonth() > c2.getBirthday().getMonth()) {
                            return -1;
                        } else {
                            return 1;
                        }
                    } else if (c1.getBirthday().getYear() > c2.getBirthday().getYear()) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
                return 0;
               /* if (o1 instanceof Employee && o2 instanceof Employee) {
                    Employee c1 = (Employee) o1;
                    Employee c2 = (Employee) o2;
                    if (c1.getBirthday().getYear() == c2.getBirthday().getYear()) {
                        if (c1.getBirthday().getMonth() == c2.getBirthday().getMonth()) {
                            if (c1.getBirthday().getDay() == c2.getBirthday().getDay())
                                return 0;
                            else if (c1.getBirthday().getDay() > c2.getBirthday().getDay())
                                return -1;
                            else
                                return 1;
                        } else if (c1.getBirthday().getMonth() > c2.getBirthday().getMonth())
                            return -1;
                        else
                            return 1;
                    } else if (c1.getBirthday().getYear() > c2.getBirthday().getYear())
                        return -1;
                    else
                        return 1;
                }
                return 0;*/
            }
        };
        /**
         * 将匿名内部类的引用comparator,传入TreeSet(),接口的使用
         */
        TreeSet<Employee> t = new TreeSet<>(comparator);
        t.add(new Employee("a", 21, new MyDate(4, 21, 1997)));
        t.add(new Employee("s", 22, new MyDate(5, 22, 1998)));
        t.add(new Employee("z", 19, new MyDate(3, 20, 1997)));
        t.add(new Employee("z", 19, new MyDate(3, 22, 1997)));
        t.add(new Employee("z", 19, new MyDate(3, 22, 1997)));
        t.add(new Employee("b", 22, new MyDate(2, 21, 1996)));
        t.add(new Employee("c", 23, new MyDate(4, 21, 1993)));

        Object[] e;
        e = t.toArray();
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }

    }

    /**
     * by name sort 字母顺序 Collections
     */
    @org.junit.Test
    public void test2() {
//        TreeSet<Employee> t = new TreeSet<>();
        try {
            ArrayList<Employee> t = new ArrayList<>();
           /* Comparator comparing = new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    return 0;
                }
            };*/
            t.add(new Employee("a", 21, new MyDate(4, 21, 1997)));
            t.add(new Employee("s", 22, new MyDate(5, 22, 1998)));
            t.add(new Employee("z", 19, new MyDate(3, 20, 1997)));
            t.add(new Employee("b", 22, new MyDate(2, 21, 1996)));
            t.add(new Employee("c", 23, new MyDate(4, 21, 1993)));
//        t.sort(comparing(Employee::getName)
//                .thenComparing(Employee::getAge)
//                .thenComparing(MyDate::getYear));
            /**
             * 根据name进行排序其次是age，同样可以通过Comparator新的组合支持来实现。
             */
            Collections.sort(t, Comparator.comparing(Employee::getName)
                    .thenComparing(Employee::getAge));
            /**
             * 2). 创建 TreeSet 时传入 Comparator对象，按生日日期的先后排序。
             */
            Comparator<MyDate> a = new MyDate();


//            Assert.assertThat(t.get(0), equalTo(new Employee("a", 12, new MyDate(4, 21, 1997))));
            Object[] e;
            e = t.toArray();
            for (int i = 0; i < e.length; i++) {
                System.out.println(e[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 自然排序 sort Comparable 对类可控制时，即能实现接口
     */
    @org.junit.Test
    public void method() {
        TreeSet<Employee> ts = new TreeSet<>();
        ts.add(new Employee("AA", 21, new MyDate(1994, 01, 3)));
        ts.add(new Employee("FF", 25, new MyDate(1995, 06, 8)));
        ts.add(new Employee("DD", 19, new MyDate(1995, 05, 14)));
        ts.add(new Employee("CC", 20, new MyDate(1993, 12, 20)));
        ts.add(new Employee("BB", 21, new MyDate(1992, 06, 12)));
        ts.add(new Employee("EE", 17, new MyDate(1983, 01, 12)));

        // System.out.println(ts);

        Object[] e;
        e = ts.toArray();
        for (int i = 0; i < ts.size(); i++) {
            System.out.println(e[i]);
        }
    }

    /**
     *
     */
    @org.junit.Test
    public void method1() {
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {

                return 0;
            }
        };
    }
}
