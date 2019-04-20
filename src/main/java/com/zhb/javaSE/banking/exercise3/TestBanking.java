package com.zhb.javaSE.banking.exercise3;

import com.zhb.javaSE.banking.Account;
import com.zhb.javaSE.banking.Customer;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-20 21:45
 **/
public class TestBanking {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane","Smith");
        Account account = new Account();
        account.setBalance(500);
        customer.setAccount(account);
        account.withdraw(150);
        account.deposit(22.5);
        account.withdraw(47.62);
        account.withdraw(400);
        customer.getAccount();
    }
}
