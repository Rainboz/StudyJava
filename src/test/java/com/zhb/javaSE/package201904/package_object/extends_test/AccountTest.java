package com.zhb.javaSE.package201904.package_object.extends_test;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void method1(){
        Account account = new Account(1122,20000,4.5);
        account.withdraw(30000);
        account.withdraw(2500);
        account.deposit(3000);
    }

}