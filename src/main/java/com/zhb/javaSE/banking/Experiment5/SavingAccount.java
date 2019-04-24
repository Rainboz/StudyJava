package com.zhb.javaSE.banking.Experiment5;

import com.zhb.javaSE.banking.Account;

import java.text.DecimalFormat;

/**
 * @program: StudyJava
 * @description: 创建 Account 类的两个子类
 * @author: rainboz
 * @create: 2019-04-20 22:45
 **/
public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount() {

    }
//    public SavingAccount(double interestRate) {
//        this.interestRate = interestRate;
//    }

    /**
     * @param balance:余额
     * @param interest_rate：保护等级balance*interest_rate = overdraftProtection
     */
    public SavingAccount(double balance, double interest_rate) {
        super(balance);
        this.interestRate = interest_rate;
        DecimalFormat d = new DecimalFormat("0%");
//        if (interest_rate > 0)
        System.out.println("Creating her Savings Account with a " +
                String.format("%.2f", balance) + " balance and " +
                d.format(interest_rate / 100) + " interest.");
//        else

    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
