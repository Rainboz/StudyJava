package com.zhb.javaSE.package201904.package_object.obj_all_13_abstract.package_05;


import java.util.List;
import java.util.Map;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-25 12:11
 **/
public class FindScoreDaoImpl extends Student implements FindScoreDao {

    //    Map<String,Student> map = new HashMap();
    private FindScoreDao findScoreDao;

    @Override
    public List<Student> findAllStu(String stu_id) {
        return findScoreDao.findAllStu(stu_id);
    }
}
