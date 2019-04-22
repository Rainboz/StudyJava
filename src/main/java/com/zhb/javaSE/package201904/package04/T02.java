package com.zhb.javaSE.package201904.package04;

public class T02 {
    public static void main(String[] args) {
        method1(35);
        method1(21);
        method1(15);
        method1(105);
        method1(3);
        method1(7);
        method1(5);
    }
    public static int method1(int a){
        if (a % 3 == 0 && a % 5 != 0 && a % 7 != 0) {
            System.out.println(a+"能被3整除");
        }else if (a % 5 == 0 && a % 7 != 0 && a % 3 != 0){
            System.out.println(a+"能被5整除");
        }else if (a % 7 == 0 && a % 3 != 0 && a % 5 != 0){
            System.out.println(a+"能被7整除");
        }else if (a % 3 == 0 && a % 5 == 0 && a % 7 != 0){
            System.out.println(a+"能被3和5同时整除");
        }else if (a % 3 == 0 && a % 7 == 0 && a % 5 != 0){
            System.out.println(a+"能被3和7同时整除");
        }else if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0){
            System.out.println(a+"能被3 5 7同时整除");
        }
        return a;
    }
}
