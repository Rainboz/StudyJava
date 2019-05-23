package com.zhb.javaSE.banking.exercise6;

import com.zhb.javaSE.banking.Account;
import com.zhb.javaSE.banking.Experiment5.CheckingAccount;
import com.zhb.javaSE.banking.Experiment5.SavingAccount;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    private SavingAccount saving = null;
    private CheckingAccount checking = null;

    public Customer() {
    }

    public Customer(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Account getAccount() {
        System.out.println("Customer [" + firstName + ", " + lastName + "] has a balance of " + account.getBalance());
        return account;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccount(Account account) {
        //account.getBalance();
        //实验5
        // System.out.println("Creating her account with a " + account.getBalance() + " balance.");
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    /* 5-1 addAccount(Account)，getAccount(int)和 getNumOfAccounts()。
     每个 Customer 可以有多个 Account。（声明至少有 5 个）
     每个 Customer 可以有多个 Account。*/
    public void addAccount(Account account) {

        this.account = account;
    }

    public Account getAccount(int account_type) {

        return account;
    }

    public void getNumOfAccounts() {

    }

    //包含两个访问方法：getSaving 和 getChecking，这两个方法分别返回储蓄
    //和支票总数。

    public SavingAccount getSaving() {
        return saving;
    }


    //支票总数。------------------------------------


    public CheckingAccount getChecking() {
        return checking;
    }

    public void setSaving(SavingAccount saving) {
        this.saving = saving;
    }

    public void setChecking(CheckingAccount checking) {
        this.checking = checking;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", account=" + account +
                '}';
    }
}
