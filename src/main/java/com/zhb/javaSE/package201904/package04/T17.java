package com.zhb.javaSE.package201904.package04;

import java.util.Scanner;

//应纳个人所得税税额= 应纳税所得额× 适用税率- 速算扣除数
public class T17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        method1(a);
    }
    public static void method1(double money){
        double decut;
        double sefValue = 0.0;
        if (money >= 0 && money < 1500){
            sefValue = money*0.03-0;
        }else if (money >=1500 && money < 4500){
            sefValue = money*0.1-105;
        }else if (money >=4500 && money < 9000){
            sefValue = money*0.2-555;
        }else if (money >=9000 && money < 35000){
            sefValue = money*0.25-1005;
        }else if (money >=35000 && money < 55000){
            sefValue = money*0.30-2755;
        }else if (money >=55000 && money < 80000){
            sefValue = money*0.35-5505;
        }else if (money >=80000){
            sefValue = money*0.45-13505;
        }
        System.out.println(sefValue);
    }
}
