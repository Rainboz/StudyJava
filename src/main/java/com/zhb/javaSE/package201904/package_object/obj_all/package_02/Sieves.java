package com.zhb.javaSE.package201904.package_object.obj_all.package_02;

import java.util.Random;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-23 19:33
 **/
public class Sieves {
    private int number_of_face;
    private int point;
    private static int random;

    public Sieves(int number_of_face, int point) {
        this.number_of_face = number_of_face;
        this.point = point;
    }

    public int roll() {
        random = (int) (1 + Math.random() * (number_of_face));
        System.out.println("筛到的数： " + random);

        return random;
    }

    public static void main(String[] args) {
        Sieves sieves = new Sieves(17, 4);
        System.out.println("面数： " + sieves.number_of_face + " 点数： " + sieves.point);
        sieves.roll();
        sieves.roll();
        sieves.roll();
        sieves.roll();


    }
}
