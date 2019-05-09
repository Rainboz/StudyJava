package com.zhb.javaSE.package201904.package_object.obj_all_07;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-25 09:48
 **/
public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane", "mith");
        Account account = new Account(1000, 2000, 1.23);
        customer.setAccount(account);
        account.deposit(100);
        account.withdraw(960);
        account.withdraw(2000);
        //customer.getAccount();
        System.out.println(customer);
    }
}
