package com.zhb.main;

public class susu {
    public static void main(String[] args) {
        int i = 2;
        while (i < 100){
            int j = 2;
            while (j <= (i/j)){
                if(true){
                    //break;
                    System.out.println(i%j);
                }
                j = j + 1;
            }
            if (j > i/j){
                System.out.println(i+"是素数");
            }
            i = i + 1;
        }
    }
}
