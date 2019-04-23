package com.zhb.javaSE.package201904.abstract_implements.package_implements_03_06.package_05;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-23 17:03
 **/
public class Door_public extends Door {
    private int open_close = 0;
    @Override
    void openDoor() {
        if (open_close == 1){
            System.out.println("房门已开！");
        }else {
            System.out.println("打开房门");
            setOpen_close(1);
        }

    }

    @Override
    void closeDoor() {
        if (open_close == 0){
            System.out.println("房门已关！");
        }else {
            System.out.println("关闭房门");
            setOpen_close(0);
        }

    }

    public int getOpen_close() {
        return open_close;
    }

    public void setOpen_close(int open_close) {
        this.open_close = open_close;
    }
}
