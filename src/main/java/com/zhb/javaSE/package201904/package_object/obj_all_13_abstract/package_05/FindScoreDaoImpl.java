package com.zhb.javaSE.package201904.package_object.obj_all_13_abstract.package_05;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-25 12:11
 **/
public class FindScoreImpl extends Student implements FindScore{

//    Map<String,Student> map = new HashMap();
    @Override
    public List<Map<String, Student>> findAllStu(List<Map<String, Student>> list) {
        Person p = new Student("zhb",22,' ',"15905139","杭电信工","99");
        Student student = (Student) p;
        list.add()
        return null;
    }
}
