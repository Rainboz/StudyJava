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
    private SavingAccount protectedBy;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, SavingAccount protectedBy) {

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
        if (super.getBalance() >= amt) {
            flag = true;
            super.setBalance(super.getBalance() - amt);
            System.out.println("Withdraw " + String.format("%.2f", amt) + ":" + flag);
            return true;
        }
        if (amt > balance) {//怎么判断存在透支保护
            if (this.overdraftProtection >= Math.abs(super.getBalance() - amt)) {
                flag = true;
//                this.balance = 0;
                setBalance(0);
                this.overdraftProtection -= Math.abs(super.getBalance() - amt);//冲减可透支金额
                System.out.println("Withdraw " + String.format("%.2f", amt) + ":" + flag);
            } else {
                flag = false;
                System.out.println("Withdraw " +
                        String.format("%.2f", amt) + ":" + flag);
            }
        }
        return flag;
    }
}
