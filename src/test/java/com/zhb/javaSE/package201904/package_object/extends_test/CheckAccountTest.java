package com.zhb.javaSE.package201904.package_object.extends_test;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckAccountTest {

    @Test
    public void withdraw() {
        CheckAccount c = new CheckAccount(1122,20000,4.5,5000);
        c.withdraw(5000);
        c.withdraw(18000);
        c.withdraw(3000);
    }
}