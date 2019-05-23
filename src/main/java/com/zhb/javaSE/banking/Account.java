package com.zhb.javaSE.banking;

public class Account {
    protected double balance;

    public Account() {
    }

    public Account(double balance) {
        super();
        //System.out.println("Creating an account with a " + String.format("%.2f", balance) + " balance");
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        //System.out.println("The account has a balance of  "+String.format("%.2f",balance));
        return balance;
    }

    public boolean deposit(double amt) {
        boolean flag = true;
        balance += amt;
        System.out.println("Deposit  " + String.format("%.2f", amt) + " succeeds?" + flag);
        return true;
    }

    public boolean withdraw(double amt) {
        boolean flag = false;
        if (balance >= amt) {
            balance -= amt;
            flag = true;
            System.out.println("Withdraw " + String.format("%.2f", amt) + ":" + flag);
            return true;
        } else {
            System.out.println("Withdraw " + String.format("%.2f", amt) + ":" + flag);
        }
        return false;
    }

}
