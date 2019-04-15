package com.zhb.javaSE.banking;

public class TestBanking {
    public static void main(String[] args) {
        Account account1 = new Account(500.00);
        account1.withdraw(150);
        account1.deposit(22.5);
        account1.withdraw(47.62);
        account1.getBalance();
    }
}
