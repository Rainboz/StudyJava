package com.zhb.javaSE.package201904.package_object.extends_test;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @program: StudyJava
 * @description:该类包括的属性：账号id，余额balance，年利率annualInterestRate；包含的方法：访问器方法（getter和setter方法），返回月利率的方法getMonthlyInterest()，取款方法withdraw()，存款方法deposit()。
 * @author: rainboz
 * @create: 19-4-22 下午10:25
 **/
public class Account {
    private int id;
    protected double balance;
    private double annualInterestRate;

//    public Account() {
//    }

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

    public Double getMonthlyInterest() {
        double MonthlyInterest = annualInterestRate / 12;
        String mi = "";////接受百分比的值
//        DecimalFormat d = new DecimalFormat("##%");
//        double df = Double.parseDouble(d.format(MonthlyInterest));
//
//        NumberFormat n = NumberFormat.getPercentInstance();
//        double nf = Double.valueOf(n.format(MonthlyInterest));
//
//        double sf = Double.parseDouble(String.format("%%",MonthlyInterest));

//        mi = d.format(MonthlyInterest);
        return MonthlyInterest;
    }

    public void withdraw(double amount) {
        if (balance - amount > 0) {
            balance -= amount;
            System.out.println("取款:" + amount + "操作[" + "取款成功，当前余额为： " + balance + "]");
        } else {
            System.out.println("余额不足[" + " 当前余额为： " + balance + "]");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("存款:" + amount + "操作[" + "存款成功，当前余额为：" + balance +
                " 月利率: " + getMonthlyInterest() + "]");
    }
}

