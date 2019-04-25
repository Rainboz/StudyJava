package com.zhb.javaSE.banking.Experiment5.package_5_01;

import com.zhb.javaSE.banking.Account;
import com.zhb.javaSE.banking.Customer;
import com.zhb.javaSE.banking.Experiment5.CheckingAccount;
import com.zhb.javaSE.banking.Experiment5.SavingAccount;

/**
 * @program: StudyJava
 * @description: 该程序创建一个客户和账户的集合，并生成这些客户及其账户余额的报告。
 * @author: rainboz
 * @create: 2019-04-25 16:59
 **/
public class TestBanking {
    //使用 instanceof 操作符测试拥有的账户类型，并且将 account_type 设置
    //为适当的值，例如：“SavingsAccount”或“CheckingAccount”。
    public static void main(String[] args) {
        //customer1 的账户设置
        Customer customer1 = new Customer();
        customer1.setFirstName("Jane");
        customer1.setLastName("Smith");
        System.out.println("Customer:"+customer1.getLastName()+","+customer1.getFirstName());

        Account c1a1 = new SavingAccount();
        c1a1.setBalance(500);
        if (c1a1 instanceof SavingAccount){
            SavingAccount s = (SavingAccount) c1a1;
//            s.setInterestRate(3);
        }
        System.out.println("Savings Account: current balance is ￥"+c1a1.getBalance());
        Account c1a2 = new CheckingAccount(200);
        System.out.println("Checking Account: current balance is ￥"+c1a2.getBalance());

        //customer2 账户设置
        Customer customer2 = new Customer("Owen", "Bryant");
        customer2.setFirstName("Owen");
        customer2.setLastName("Bryant");
        System.out.println("Customer:"+customer2.getLastName()+","+customer2.getFirstName());

        Account c2a1 = new CheckingAccount(200);
        System.out.println("Checking Account: current balance is ￥"+c2a1.getBalance());

        //customer3 账户设置
        Customer customer3 = new Customer("Tim", "Soley");
        customer3.setFirstName("Tim");
        customer3.setLastName("Soley");
        System.out.println("Customer:"+customer3.getLastName()+","+customer3.getFirstName());

        Account c3a1 = new SavingAccount(1500);
        System.out.println("Savings Account: current balance is ￥"+c3a1.getBalance());
        Account c3a2 = new CheckingAccount(200);
        System.out.println("Checking Account: current balance is ￥"+c3a2.getBalance());

        //customer4 账户设置
        Customer customer4 = new Customer("Maria", "Soley");
        customer4.setFirstName("Maria");
        customer4.setLastName("Soley");
        System.out.println("Customer:"+customer4.getLastName()+","+customer4.getFirstName());
        Account c4a1 = new SavingAccount(200);
        System.out.println("Savings Account: current balance is ￥"+c4a1.getBalance());
        Account c4a2 = new CheckingAccount(150);
        System.out.println("Checking Account: current balance is ￥"+c4a2.getBalance());

    }
}
