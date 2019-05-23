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

    public CheckingAccount(double balance, SavingAccount protect) {
        super(balance);
        this.protectedBy = protect;

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

    public SavingAccount getProtectedBy() {
        return protectedBy;
    }

    public void setProtectedBy(SavingAccount protectedBy) {
        this.protectedBy = protectedBy;
    }

    /*@Override
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

                this.overdraftProtection -= Math.abs(super.getBalance() - amt);//冲减可透支金额
                 setBalance(0);//赋值之后设置余额
                System.out.println("Withdraw " + String.format("%.2f", amt) + ":" + flag);
            } else {
                flag = false;
                System.out.println("Withdraw " +
                        String.format("%.2f", amt) + ":" + flag);
            }
        }
        return flag;
    }*/
    @Override
    public boolean withdraw(double amt) {
        boolean flag = false;
        if (super.getBalance() >= amt) {
            flag = true;
            super.setBalance(super.getBalance() - amt);
            System.out.println("Withdraw " + String.format("%.2f", amt) + " succeeds?" + flag);
            return true;
        }
        if (amt > super.getBalance()) {//怎么判断存在透支保护
            if (protectedBy.getBalance() >= Math.abs(super.getBalance() - amt)) {
                flag = true;
//              this.balance = 0;

                //protectedBy.getBalance()-= Math.abs(super.getBalance() - amt)
//                System.out.println(Math.abs(super.getBalance() - amt));
                protectedBy.setBalance(protectedBy.getBalance() - Math.abs(super.getBalance() - amt));//冲减可透支金额
                setBalance(0);//赋值之后设置余额
                System.out.println("Withdraw " + String.format("%.2f", amt) + " succeeds?" + flag);
            } else {
                flag = false;
                System.out.println("Withdraw " +
                        String.format("%.2f", amt) + " succeeds?" + flag);
            }
        }
        return flag;
    }
}
