package com.zhb.javaSE.T19;

public class WuMingFen {
    private String theMa;
    private int x;
    private boolean likeSoup;

    public WuMingFen(String theMa, int x, boolean likeSoup) {
        this.theMa = theMa;
        this.x = x;
        this.likeSoup = likeSoup;
    }
    public WuMingFen(String theMa, int x){
        this.theMa = theMa;
        this.x = x;
    }
    public WuMingFen(){
        theMa = "酸辣面";
        x = 2;
        likeSoup = true;
    }

    //@Override
    public String check() {
        return "WuMingFen{" +
                "theMa='" + theMa + '\'' +
                ", x=" + x +
                ", likeSoup=" + likeSoup +
                '}';
    }

    public static void main(String[] args) {
        WuMingFen f1 = new WuMingFen("牛肉",3,true);
        WuMingFen f2 = new WuMingFen("牛肉",2);
        WuMingFen f3 = new WuMingFen();
        System.out.println(f1.check());
        System.out.println(f2.check());
        System.out.println(f3.check());
    }
}
