package com.zhb.javaSE.package_201906.collection_student_sys;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-06-17 12:34
 **/
public class Course {
    private String id;
    private String name;

    public Course(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
