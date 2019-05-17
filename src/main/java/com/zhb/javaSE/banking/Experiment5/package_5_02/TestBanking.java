package com.zhb.javaSE.banking.Experiment5.package_5_02;

import com.zhb.javaSE.banking.Account;
import com.zhb.javaSE.banking.Customer;
import com.zhb.javaSE.banking.Experiment5.CheckingAccount;
import com.zhb.javaSE.banking.Experiment5.SavingAccount;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-25 17:34
 **/
public class TestBanking {
    public static void main(String[] args) {
        //customer1 的账户设置
        Customer customer1 = new Customer();
        customer1.setFirstName("Jane");
        customer1.setLastName("Smith");

        SavingAccount c1a1 = new SavingAccount(500);

        Account c1a2 = new CheckingAccount(200,c1a1);
        System.out.println("Customer["+customer1.getLastName()+","+customer1.getFirstName()+
                "]has a checking balance of "+c1a2.getBalance()+" and a savings balance of "+
                c1a1.getBalance());
        /**
         * Checking Acct [Jane Simms] : withdraw 150.00 succeeds? true
         * Checking Acct [Jane Simms] : deposit 22.50 succeeds? true
         * Checking Acct [Jane Simms] : withdraw 147.62 succeeds? true
         */
      /*  c1a2.deposit(22.5);
        c1a2.withdraw(150);
        c1a2.withdraw(147.62);
        customer1.getChecking();
        System.out.println(c1a1.getBalance()+"----"+c1a2.getBalance());*/
        customer1.setChecking((CheckingAccount) c1a2);
        customer1.setSaving(c1a1);

        System.out.print("Checking Acct ["+customer1.getFirstName()+" "+customer1.getLastName()+"] : ");
        customer1.getChecking().withdraw(150);

        System.out.print("Checking Acct ["+customer1.getFirstName()+" "+customer1.getLastName()+"] : ");
        customer1.getChecking().deposit(22.5);

        System.out.print("Checking Acct ["+customer1.getFirstName()+" "+customer1.getLastName()+"] : ");
        customer1.getChecking().withdraw(147.62);

        /**
         * Customer [Simms, Jane] has a checking balance of 0.0 and a savings
         * balance of 424.88
         */
        System.out.println("Customer["+customer1.getLastName()+","+customer1.getFirstName()+
                "]has a checking balance of "+customer1.getChecking().getBalance()+" and a savings balance of "+
                customer1.getSaving().getBalance());
        //System.out.println(customer1.getChecking().getBalance()+"----"+customer1.getSaving().getBalance());

        /**
         * Customer [Bryant, Owen] has a checking balance of 200.0
         * Checking Acct [Owen Bryant] : withdraw 100.00 succeeds? true
         * Checking Acct [Owen Bryant] : deposit 25.00 succeeds? true
         * Checking Acct [Owen Bryant] : withdraw 175.00 succeeds? false
         * Customer [Bryant, Owen] has a checking balance of 125.0
         */
        //customer2 的账户设置
        Customer customer2 = new Customer();
        customer2.setFirstName("Owen");
        customer2.setLastName("Bryant");

        SavingAccount c2a1 = new SavingAccount(0);
        Account c2a2 = new CheckingAccount(200,c2a1);
        customer2.setChecking((CheckingAccount) c2a2);
        customer2.setSaving(c2a1);

        System.out.println("Customer["+customer2.getLastName()+","+customer2.getFirstName()+
                "]has a checking balance of "+c2a2.getBalance());

        System.out.print("Checking Acct ["+customer2.getFirstName()+" "+customer2.getLastName()+"] : ");
        customer2.getChecking().withdraw(100);

        System.out.print("Checking Acct ["+customer2.getFirstName()+" "+customer2.getLastName()+"] : ");
        customer2.getChecking().deposit(25);

        System.out.print("Checking Acct ["+customer2.getFirstName()+" "+customer2.getLastName()+"] : ");
        customer2.getChecking().withdraw(145);

        System.out.println("Customer["+customer2.getLastName()+","+customer2.getFirstName()+
                "]has a checking balance of "+customer2.getChecking().getBalance());

    }
}
