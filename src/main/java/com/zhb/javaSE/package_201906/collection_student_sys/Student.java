package com.zhb.javaSE.package_201906.collection_student_sys;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: StudyJava
 * @description: 模拟学生选课功能
 * 1.选择课程（集合添加课程）
 * 2.删除所选的某门课程（删除集合中的元素）
 * 3.查看所选课程
 * 4.修改所选课程
 * @author: rainboz
 * @create: 2019-06-17 12:33
 **/
public class Student {
    private String id;
    private String name;
    private Set courses;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new HashSet();
    }
}
