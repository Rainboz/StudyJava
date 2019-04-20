package com.zhb.javaSE.banking.Experiment5;

import com.zhb.javaSE.banking.Account;

/**
 * @program: StudyJava
 * @description: 创建 Account 类的两个子类
 * @author: rainboz
 * @create: 2019-04-20 22:46
 **/
public class CheckingAccount extends Account {
    private double overdraftProtection;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double protect) {
        super(balance);
        this.overdraftProtection = protect;
        if (protect <= 0) {
            System.out.println("Creating his Checking Account with a " +
                    "" + String.format("%.2f", balance) + " balance and no overdraft protection.");
        } else {
            System.out.println("Creating his Checking Account with a " +
                    "" + String.format("%.2f", balance) + " balance and " + String.format("%.2f", protect) + " in overdraft protection.");
        }
    }

    @Override
    public boolean withdraw(double amt) {
        boolean flag = false;
        if (balance >= amt) {
            flag = true;
            System.out.println("Withdraw " + String.format("%.2f", amt) + ":" + flag);
            return true;
        } else if (overdraftProtection > 0) {//怎么判断存在透支保护
            overdraftProtection = balance - amt;
            flag = true;
            System.out.println("Withdraw " + String.format("%.2f", amt) + ":" + flag);
        } else {
            flag = false;
            System.out.println("Creating his Checking Account with a " + String.format("%.2f", balance) + " balance and no overdraft protection.");
        }
        return flag;
    }
}
