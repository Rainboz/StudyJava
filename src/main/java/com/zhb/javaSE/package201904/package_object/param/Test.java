package com.zhb.javaSE.package201904.package_object.param;

import com.sun.xml.internal.bind.v2.model.core.ID;

import javax.swing.*;
import java.util.Calendar;

/**
 * @program: StudyJava
 * @description: 参数传递
 * @author: rainboz
 * @create: 2019-04-19 16:10
 **/
public class Test {

    public static void main(String[] args) {
        int[] a=new int[1];
        modify(a);
        System.out.println(a[0]); //
        User user = new User("rainbo","55555","@gameschool.com");
        user.setE_mail(user.getID()+user.getE_mail());
        System.out.println(user.toString());

    }
    public static void modify(int[] a){
        a[0]++;
    }
}
