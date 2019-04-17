package com.zhb.javaSE.banking;

public class Account {
    private double balance;

    public Account() {
    }

    public Account(double balance) {
        System.out.println("Creating an account with a "+String.format("%.2f",balance)+" balance");
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        System.out.println("The account has a balance of  "+String.format("%.2f",balance));
        return balance;
    }

    public boolean deposit(double amt ){
        balance += amt;
        System.out.println("Deposit  "+String.format("%.2f",amt));
        return true;
    }
    public boolean withdraw(double amt){

        if (balance >= amt){
            balance -= amt;
            System.out.println("Withdraw "+String.format("%.2f",amt));
            return true;
        }else {
            System.out.println("余额不足！");
        }
        return false;
    }
}
