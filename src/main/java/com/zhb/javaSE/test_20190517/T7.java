package com.zhb.javaSE.test_20190517;

import java.util.*;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 19-5-17 下午12:06
 **/
public class T7 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Tom", 18, 100, "claass05"));
        list.add(new Student("Jerry", 22, 70, "claass04"));
        list.add(new Student("Owen", 25, 90, "claass05"));
        list.add(new Student("Jim", 30, 80, "claass05"));
        list.add(new Student("Steve", 28, 66, "claass06"));
        list.add(new Student("Kevin", 24, 100, "claass04"));


        TreeSet<String> t = new TreeSet();

        for (int i = 0; i < list.size(); i++) {
            t.add(list.get(i).getClassNum());
            System.out.println(list.get(i));
        }
        // System.out.println(list);
        Iterator it = t.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            //System.out.println(str);

        }

        System.out.println("总班级数: "+t.size());

        for (String str : t) {
            double sum = 0;
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                if (str.equals(list.get(i).getClassNum())) {
                    sum += list.get(i).getScore();
                    count++;
                }

            }
            System.out.println("sum:"+sum+",平均分: "+(sum/count)+"人数: "+count);
        }
        Collections.sort(list,Comparator.comparing(Student::getScore).thenComparing(Student::getAge));
        Object[] e;
        e = list.toArray();
        System.out.println("根据成绩排序，然后成绩相同根据年龄排序：");
        for (Object o : e){
            System.out.println(o);
        }
    }
}

