package com.zhb.javaSE.banking.Experiment5;

import com.zhb.javaSE.banking.Account;
import com.zhb.javaSE.banking.Bank;
import com.zhb.javaSE.banking.Customer;

import java.text.DecimalFormat;

/**
 * @program: StudyJava
 * @description: test
 * @author: rainboz
 * @create: 2019-04-20 23:13
 **/
public class TestBanking {
    public static void main(String[] args) {
//        Customer customer1 = new Customer("Jane","Smith");
//        Account account1 = new SavingAccount(500,3);
//
//        Customer customer2 = new Customer("Owen","Bryant");
//        Account account2 = new CheckingAccount(500, 0);
//
//        Customer customer3 = new Customer("Tim","Soley");
//        Account account3 = new CheckingAccount(500,500);
//
//        Customer customer4 = new Customer("Maria","Soley");
//        customer4.setAccount(account3);
        Bank bank0 =new Bank();
        bank0.addCustomer("Smith","Jane");
        bank0.addCustomer("Bryant","Owen");
        bank0.addCustomer("Soley","Tim");
        bank0.addCustomer("Soley","Maria");


        Account account1 = new SavingAccount();
        Customer customer1 = bank0.getCustomer(1);//1,2,3,4
        customer1.setAccount(account1);
        System.out.println("Creating the customer "+customer1.getLastName()+" "+customer1.getFirstName());
        DecimalFormat d = new DecimalFormat("0%");
//        if (interest_rate > 0)
        //强制转换调用子类独有方法
        SavingAccount savingAccount = (SavingAccount) account1;
        savingAccount.setInterestRate(3);//初始化
        account1.setBalance(500);
        System.out.println("Creating her Savings Account with a " +
                String.format("%.2f", account1.getBalance()) + " balance and " +
                d.format(savingAccount.getInterestRate() / 100) + " interest.");

        Account account2 = new CheckingAccount(500);
        Customer customer2 = bank0.getCustomer(2);//1,2,3,4
        customer2.setAccount(account2);
        System.out.println("Creating the customer "+customer2.getLastName()+" "+customer2.getFirstName());

    }
}
