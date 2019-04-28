package com.zhb.javaSE.T16;

public class Computer {
    public int add(int ...a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
    void reduce(double a,double b){
        System.out.println("两个数相减："+(a-b));//大数减法，移位运算
    }
    void chen(double a,double b){//字符串相乘
        System.out.println("两个数相乘："+(a*b));
    }
    void chu(double a,double b){
        System.out.println("两个数相除："+(a/b));
    }
    void pow(double a,double b){
        System.out.println("两个数："+(a/b));
    }
    void leijia(int n){
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            sum += n;
        }
        System.out.println(n+"的累加为："+sum);
    }
    void jiechen(int n){
        //1*2*3*4
        int result = 1;
        for (int i = 1; i <= n ; i++) {
            result = result * i;
        }
        System.out.println(n+"的阶乘为："+result);
    }
    void cifang(double a,int b){
        double result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println(a+"的"+b+"次方为："+result);
    }
    void sushu(int n){
        boolean b = false;
        if (n == 2){
            b = true;
        }else {
            for (int i = 2; i <= n; i++) {
                int r = 0;
                r = n%i;
                if (r == 0){
                    b = false;
                }else {
                    b = true;
                }
            }
        }
        System.out.println(n+"是否为素数："+b);
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        Computer computer = new Computer();
        computer.add(a);
        System.out.println(computer.add(a));
        computer.reduce(1,2);
        computer.chen(1,2);
        computer.chu(1,2);
        computer.leijia(4);
        computer.jiechen(0);
        computer.cifang(2,10);
        computer.sushu(2);
    }

}
