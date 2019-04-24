package com.zhb.javaSE.package201904.package_object.obj_all_09.package_04;

import com.zhb.javaSE.package201904.package_object.extends_test.B;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-23 22:15
 **/
public class BankAccount {
    private int bankAccountId;
    private Date date;
    private double rest;

    public BankAccount(int bankAccountId, Date date, double rest) {
        this.bankAccountId = bankAccountId;
        this.date = date;
        this.rest = rest;
    }

    public int getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(int bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getRest() {
        return rest;
    }

    public void setRest(double rest) {
        this.rest = rest;
    }

    /**
     * 处理存入账
     */
    public boolean Bankin(double amt) {
        this.rest += amt;
        System.out.println("BankAccount[" + "bankAccountId: " + bankAccountId + " 存款: " + amt + " 成功，当前余额为： " + rest + "]");
        return true;
    }

    /**
     * 处理取出账
     */
    public boolean Bankout(double amt) {
        if (rest > amt) {//余额 > 取款
            rest -= amt;
            System.out.println("BankAccount[" + "bankAccountId: " + bankAccountId + " 取款: " + amt + " 成功，当前余额为： " + rest + "]");
            return true;
        } else {
            System.out.println("BankAccount[" + "bankAccountId: " + bankAccountId + " 取款: " + amt + " 失败，余额不足，当前余额为： " + rest + "]");
        }
        return false;
    }

    /**
     * 负责生成账号的自动增长的函数
     */
    public int addByAutoId() {
        setBankAccountId(getBankAccountId() + 1);
        return getBankAccountId();
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "BankAccount{" +
                "bankAccountId=" + bankAccountId +
                ", date=" + sdf.format(date) +
                ", rest=" + rest +
                '}';
    }

    public static void main(String[] args) {
//        BankAccount b = new BankAccount();
//        b.setDate(new Date());
//        System.out.println(b.getDate());
        Date date = new Date();
        //创建账户1
        BankAccount bankAccount1 = new BankAccount(1, date, 20000);
        bankAccount1.Bankin(2000);
        bankAccount1.Bankout(20000);
        bankAccount1.Bankout(3000);
        System.out.println(bankAccount1.toString());
        System.out.println();
        //创建账户2
        BankAccount bankAccount2 = new BankAccount(bankAccount1.addByAutoId(), date, 2000);
        bankAccount2.Bankin(300);
        bankAccount2.Bankout(2000);
        bankAccount2.Bankout(300);
        System.out.println(bankAccount2.toString());
    }
}
