package com.zhb.javaSE.banking.exercise2;

import com.zhb.javaSE.banking.Account;
import com.zhb.javaSE.banking.Customer;

public class TestBanking {
    public static void main(String[] args) {
//        Customer customer = new Customer("Jane","Smith");
//        Account account = new Account(500);
//        customer.setAccount(account);
//        account.withdraw(150);
//        account.deposit(22.5);
//        account.withdraw(47.62);
//        account.getBalance();
        Customer customer = new Customer("Jane", "Smith");

        Account account = new Account();
        account.setBalance(500);
        customer.setAccount(account);
        account.withdraw(150);
        account.deposit(22.5);
        account.withdraw(47.62);
        System.out.println("Customer ["+customer.getFirstName()+", "+customer.getLastName()+
                "] has a balance of "+account.getBalance());
        //customer.getAccount();

    }
}
