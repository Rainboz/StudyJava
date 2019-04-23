package com.zhb.javaSE.package201904.package_object.obj_all.package_03;

import java.util.Scanner;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-23 19:51
 **/
public class Hero {
    private String name;
    private int live_value;
    private int level;

    public Hero(int heroType) {
        if (heroType == 1) {
            this.live_value = 100;
            setLevel(1);
        }
        if (heroType == 2) {
            this.live_value = 200;
            setLevel(2);
        }
    }

    public Hero(int live_value, int level) {
        this.live_value = live_value;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLive_value() {
        return live_value;
    }

    public void setLive_value(int live_value) {
        this.live_value = live_value;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", live_value=" + live_value +
                ", level=" + level +
                '}';
    }

    public void fighting(Hero hero) {
       hero.live_value -= 20;
    }

    public void fighting(Hero hero,String last) {
        if (last.equals("降龙十八掌")){
            hero.live_value -= 30;
        }
        if (last.equals("九阴白骨爪")){
            hero.live_value -= 60;
        }
        if (last.equals("九阳神功")){
            hero.live_value -= 20;
        }
        if (last.equals("武穆遗书")){
            hero.live_value -= 70;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入英雄名字： ");
        Hero hero = new Hero(1);
        hero.setName(sc.next());

        System.out.println(hero.toString());

        Hero hero1 = new Hero(2);
        hero1.setName(sc.next());
        System.out.println(hero1.toString());

        //hero 攻击 hero1
        hero.fighting(hero1);
        System.out.println("hero1被hero攻击，生命值降低为："+hero1.getLive_value());

        //heo1 攻击 hero
        hero1.fighting(hero);
        System.out.println("hero被hero1攻击，生命值降低为："+hero.getLive_value());

        //hero 要放大招了
        hero.fighting(hero1,"九阴白骨爪");
        System.out.println("hero被hero1的九阴白骨爪攻击，生命值降低为："+hero1.getLive_value());

        //hero1 要放大招了
        hero.fighting(hero1,"武穆遗书");
        System.out.println("hero1被hero的武穆遗书攻击，生命值降低为："+hero1.getLive_value());

    }
}
