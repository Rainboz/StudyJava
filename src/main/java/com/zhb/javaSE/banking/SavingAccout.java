package com.zhb.javaSE.banking;

public class SavingAccout extends Account{
    private double interestRate;

    public SavingAccout(double balance,double interestRate) {
        this.interestRate = interestRate;
    }

}
