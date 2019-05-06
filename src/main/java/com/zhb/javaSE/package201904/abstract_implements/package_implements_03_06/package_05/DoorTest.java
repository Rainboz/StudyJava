package com.zhb.javaSE.package201904.abstract_implements.package_implements_03_06.package_05;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-23 17:47
 **/
public class DoorTest {
    public static void main(String[] args) {
        BrDoorImpl brDoor = new BrDoorImpl();
        brDoor.bulletproof();
        brDoor.rustroof();
        System.out.println("打开：");
//        if (brDoor.getOpen_close() == 0){
//            brDoor.openDoor();
//            brDoor.setOpen_close(1);
//        }
        brDoor.openDoor();
        System.out.println();
        System.out.println("关闭：");
        brDoor.closeDoor();
        System.out.println();

        TwdoorImpl twdoor = new TwdoorImpl();
        twdoor.theftproof();
        System.out.println("打开：");
        twdoor.openDoor();
        System.out.println();
        System.out.println("关闭：");
        twdoor.closeDoor();
        System.out.println();
        twdoor.waterproof();
    }
}
