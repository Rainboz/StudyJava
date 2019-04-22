package com.zhb.javaSE.banking.Experiment5;

import com.zhb.javaSE.banking.Account;
import com.zhb.javaSE.banking.Bank;
import com.zhb.javaSE.banking.Customer;

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

        Account account1 = new SavingAccount(500,3);
        Customer customer1 = bank0.getCustomer(0);
        customer1.setAccount(account1);
        System.out.println("Creating the customer "+customer1.getLastName()+" "+customer1.getFirstName());
    }
}
