package com.zhb.javaSE.package201904.package_object.obj_all_07;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-25 09:43
 **/
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account() {
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            System.out.println("成功取出："+amount+" 当前余额："+balance);
        } else {
            System.out.println("余额不足!");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("成功存入 ："+amount+" 当前余额："+balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                '}';
    }
}
