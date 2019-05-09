package com.zhb.javaSE.package201904.package_collections.myObjectArray;

import java.util.Arrays;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-29 16:35
 **/

public class StudentDemo {
    public static void main(String[] args) {
        String str = "sds sd ssds";
        String[] a = str.split(" ");
        System.out.println(Arrays.toString(a));
        Student[] s = new Student[3];
        Student student1 = new Student("zhb",1);
        Student student2 = new Student("s",2);
        Student student3 = new Student("d",43);
        s[0] = student1;
        s[1] = student2;
        s[2] = student3;
        for (Student x :s) {
            System.out.println(x);
        }
    }
}
