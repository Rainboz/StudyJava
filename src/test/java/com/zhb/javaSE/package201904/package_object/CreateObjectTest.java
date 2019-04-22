package com.zhb.javaSE.package201904.package_object;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreateObjectTest {
    CreateObject createObject = new CreateObject();
    @Test
    public void createobj1() throws Exception {//一定要抛出异常
        createObject.createobj1();
        System.out.println("-------------------------------");
        createObject.createobj2();
        System.out.println("-------------------------------");
        createObject.createobj3();
    }

}