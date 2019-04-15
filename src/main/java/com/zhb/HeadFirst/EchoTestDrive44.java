package com.zhb.HeadFirst;
/*
* 要求输出：helloooo...四次加数字10或者24
* 过程：x=0,e1=1,e2=0 || x=1,e1=2,e2=1 || x=2,e1=3,e2=2,-->e2=2+3=5 || x=3,e1=4,e2=6,-->e2=6+4=10
* */
public class EchoTestDrive44 {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo();
//        此时e2.count = 24
//        Echo e2 = e1;
        int x = 0;
        while(x < 4){
            e1.hello();
            e1.count = e1.count + 1;

            if (x == 3){//或者x > 0
                e2.count = e2.count + 1;
            }
            if (x > 0){//或者x > 1
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }
        System.out.println(e2.count);
    }
    static class Echo{
        int count = 0;
        void hello(){
            System.out.println("helloooo...");
        }
    }
}
