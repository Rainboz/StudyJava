package com.zhb.javaSE.package201904.package_object.obj_all_13_abstract.package_05;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-25 12:34
 **/
public class FindController {
    private FindScoreDaoImpl findScoreDao;

    public List<Student> method(String stu_id) {
        Person person[] = new Person[10];

        for (int i = 0; i < person.length; i++) {
            person[i] = new Student();
            Student student = (Student) person[i];
            student.setStu_id(String.valueOf(i));
            student.setName("zhb" + i);
            student.setSex('男');
            student.setAge(12 + i);
            student.setStu_school("杭电信工");
            student.setStu_sroce(88 + i + "");
            if (stu_id.equals(student.getStu_id())) {
                //System.out.println(Arrays.toString(person));

                System.out.println(person[i].toString());
            }
        }
        //System.out.println("255"+Arrays.toString(person));
//        Student student = new Student();
//        student.setStu_id("1");
//        student.setStu_school("杭电信工");
//        student.setStu_sroce("99");
//        student.setAge(22);
//        student.setName("zhb");
//        student.setSex('男');


        List list = new ArrayList();
        list.add(person);
//        return student;
        return list;
    }

    public static void main(String[] args) {
        FindController f = new FindController();
        //  System.out.println(f.method("1").get(0).getStu_sroce());
        f.method("1");
        f.method("0");
        f.method("2");
        f.method("3");
        f.method("4");
        f.method("6");
        f.method("8");
        f.method("9");
        f.method("10");
        //f.method("1").toArray();
    }
}
