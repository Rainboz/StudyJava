package com.zhb.javaSE.T15;

public class Hero {
    private int power = 100;
    private String name;

    public Hero(int power, String name) {
        this.power = power;
        this.name = name;
    }

    public Hero() {
    }

    @Override
    public String toString() {
        return "Hero{" +
                "power='" + power + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //行走的方法，如果体力值为0，则输出不能行走，此英雄已死亡的信息
    void go(Hero hero){
        if (hero.power <= 0){
            System.out.println("该英雄不能行走,能量为"+hero.power+"名字："+hero.name);
        }else if (power > 100){
            power = 100;
        }else {
            System.out.println("体力充沛:"+power);
        }
    }
    //吃的方法，参数是补充的血量，将 n的值加到属性power中，power的值最大为100
    void eat(int n){
        power += n;
        if (power >= 100){
            power = 100;
            System.out.println("充能后体力值："+power);
        }
    }
    //每受到一次伤害，体力值－10，体力值最小不能小于0
    void hurt(){
        power -= 10;
        if (power < 0){
            power = 0;
        }
        System.out.println("受到伤害之后体力值："+power);
    }

    public static void main(String[] args) {
        Hero hero = new Hero(190,"刷副本");
        hero.go(hero);
        hero.hurt();
        System.out.println(hero.toString());
        hero.eat(10);
        for (int i = 0; i < 6; i++) {
            hero.hurt();
        }
        hero.eat(20);
        System.out.println(hero.toString());
    }
}
