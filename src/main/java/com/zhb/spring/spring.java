package com.zhb.spring;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-06-04 11:22
 **/
public class spring {
    @Resource
    private int id;

    public spring(int id) {
        this.id = id;

    }
}
