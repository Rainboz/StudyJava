package com.zhb.javaSE.banking.Experiment5;

import com.zhb.javaSE.banking.Account;
import com.zhb.javaSE.banking.Customer;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-25 15:56
 **/
public class TestBanking {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Jane", "Smith");
        Account account1 = new SavingAccount(500, 3);

        Customer customer2 = new Customer("Owen", "Bryant");
        Account account2 = new CheckingAccount(500, 0);

        Customer customer3 = new Customer("Tim", "Soley");
        Account account3 = new CheckingAccount(500, 500);

        Customer customer4 = new Customer("Maria", "Soley");
        Account account4 = account3;
        System.out.println("Maria shares her Checking Account with her husband Tim.");
        System.out.println("Retrieving the customer Jane Smith with her savings account.");
        account1.withdraw(150);
        account1.deposit(22.50);
        account1.withdraw(47.62);
        account1.withdraw(400);
        customer1.setAccount(account1);
        customer1.getAccount();

        System.out.println("Retrieving the customer Owen Bryant with his checking account with no overdraft protection.");
        account2.withdraw(150);
        account2.deposit(22.50);
        account2.withdraw(47.62);
        account2.withdraw(400);
        customer2.setAccount(account2);
        customer2.getAccount();

        System.out.println("Retrieving the customer Tim Soley with his checking account that\n" +
                "has overdraft protection.");
        account3.withdraw(150);
        account3.deposit(22.5);
        account3.withdraw(47.62);
        account3.withdraw(400);
        customer3.setAccount(account3);
        customer3.getAccount();

        System.out.println("Retrieving the customer Maria Soley with her joint checking account");
        account3.deposit(150);
        account3.withdraw(750);
        customer4.setAccount(account4);
        customer4.getAccount();
    }

}
