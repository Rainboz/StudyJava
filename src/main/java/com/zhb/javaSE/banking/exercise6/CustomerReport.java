package com.zhb.javaSE.banking.exercise6;

import com.zhb.javaSE.banking.Account;
import com.zhb.javaSE.banking.Experiment5.CheckingAccount;
import com.zhb.javaSE.banking.Experiment5.SavingAccount;

import java.util.Arrays;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 19-5-17 下午4:42
 **/
public class CustomerReport {
    public static void main(String[] args) {

        Bank bank = Bank.getBankInstance();

        Customer c1 = new Customer("Jane", "Smith");
        Customer c2 = new Customer("Bryant", "Owen");
        Customer c3 = new Customer("Soley", "Tim");
        Customer c4 = new Customer("Soley", "Maria");
        Customer customers[] = bank.addCustomer(c1,c2,c3,c4);

        // System.out.println(Arrays.toString(customers));
        Account c1a1 = new SavingAccount(500);
        Account c1a2 = new CheckingAccount(200);
        System.out.println(customers[0]);
        System.out.println(customers[1]);
        System.out.println(customers[2]);
        System.out.println(customers[3]);
        System.out.println("Customer: ");

    }
}

