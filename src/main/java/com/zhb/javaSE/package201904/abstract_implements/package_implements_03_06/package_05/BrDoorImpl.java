package com.zhb.javaSE.package201904.abstract_implements.package_implements_03_06.package_05;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-23 17:01
 **/
public class BrDoorImpl extends Door_public implements BrDoor{
    @Override
    public void bulletproof() {
        System.out.println("该门防弹");
    }

    @Override
    public void rustroof() {
        System.out.println("该门防锈");
    }


}
