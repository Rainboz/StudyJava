package com.zhb.javaSE.banking;

import java.text.DecimalFormat;

public class TestBanking {
    public static void main(String[] args) {
        /**
         * 实验1、
         */
//        Account account1 = new Account(500.00);
//        account1.withdraw(150);
//        account1.deposit(22.5);
//        account1.withdraw(47.62);
//        account1.getBalance();
//        DecimalFormat decimalFormat = new DecimalFormat(".##");
//
//        System.out.println("The account has a balance of "+
//                decimalFormat.format(account1.getBalance()));
        /**
         * 实验题目 4：在类中使用数组作为模拟集合操作。
         */
        Bank bank0 =new Bank();
        bank0.addCustomer("Simms","Jane");
        bank0.addCustomer("Bryant","Owen");
        bank0.addCustomer("Soley","Tim");
        bank0.addCustomer("Soley","Maria");
//        System.out.println(bank0.getCustomer(0).getFirstName());
    }
}
