package com.zhb.javaSE.package201904.abstract_implements.package_implements_03_06.package_05;

public class TwdoorImpl extends Door_public implements TwDoor{

    @Override
    public void theftproof() {
        System.out.println("该门防盗");
    }

    @Override
    public void waterproof() {
        System.out.println("该门防水");
    }
}
