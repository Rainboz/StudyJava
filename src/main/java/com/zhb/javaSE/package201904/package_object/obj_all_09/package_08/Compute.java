package com.zhb.javaSE.package201904.package_object.obj_all_09.package_08;


/**
 * @program: StudyJava
 * @description: 方法有 sort()、disp()，,它们分别用于按成绩排序和输出数据。
 * @author: rainboz
 * @create: 2019-04-24 10:09
 **/
public class Compute {

    public Student[] sort(Student[] student){
        /**
         *功能描述 @description: TODO 成绩排序
         * @date 19-4-24 上午10:22
         * @param [student]
         * @return Student[]
         */
        double temp = 0;
        for (int i = 0; i < student.length-1; i++) {
            for (int j = 0; j < student.length-i-1; j++) {
                if (student[j+1].getStu_sroce() > student[j].getStu_sroce()){
                    temp = student[j].getStu_sroce();
                    student[j].setStu_sroce(student[j+1].getStu_sroce());//用getter，setter进行元素交换
                    student[j+1].setStu_sroce(temp);
                }
            }
        }
        System.out.println();
        return student;
    }
    public Student[] disp(Student[] students){
       /**
        *功能描述 @description: TODO 输出数据
        * @date 19-4-24 上午10:23
        * @param [students]
        * @return Student[]
        */
       /*0 1 2 3 4 5 6 7 8 9
        *Student[10] 前70%：0 1 2 3 4 5 6 ，后30%：7，8，9
        * student.length*0.7*/
       /* for (int i = 0; i <(int) students.length*0.7 ; i++) {
            System.out.println("合格(PASS): "+students[i].toString());
        }//原来用拆分数组输出
        for (int i = 0; i <students.length -((int) students.length*0.7) ; i++) {
            System.out.println("不合格(FAIL): "+students[i].toString());
        }*/
       //遍历输出
       for (Student s : students){
           System.out.println("原学生数据："+s);
       }
        for (int i = 0; i <students.length ; i++) {//只要判断数组下标的i，即可进行控制输出
            if (i < (int) students.length*0.7){
                System.out.println("合格(PASS): "+students[i]);//隐式调用.toString()
            }else {
                System.out.println("不合格(FAIL): "+students[i].toString());//显式调用.toString()
            }
        }
        return students;
    }
}
