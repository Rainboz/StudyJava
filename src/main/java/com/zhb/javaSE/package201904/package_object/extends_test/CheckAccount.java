package com.zhb.javaSE.package201904.package_object.extends_test;

/**
 * @program: StudyJava
 * @description:创建Account类的一个子类CheckAccount代表可透支的账户，该账户中定义一个属性overdraft代表可透支限额。在CheckAccount类中重写withdraw方法
 * @author: rainboz
 * @create: 19-4-22 下午11:01
 **/
public class CheckAccount extends Account {
    private double overdraft;

//    public CheckAccount() {
//    }

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public void withdraw(double amount) {
        //System.out.println("重写父类withdraw方法");
        /**
         * @Description //TODO 不改变属性权限的情况下，使用父类属性的geter和seter方法修改属性值。
         **/
       /* if (super.getBalance() > amount) {
            double a = getBalance() - amount;
            setBalance(a);
            System.out.println("Account[" + "id:" + getId() + "," + " 账户余额: " +
                    getBalance() + ",月利率：" + getMonthlyInterest() + ", 可透支额: " +
                    overdraft + "]");
        }
        if (getBalance() < amount) {

            if (overdraft > (amount - getBalance())) {
                this.overdraft = overdraft - (amount - getBalance());
                setBalance(0);
                System.out.println("Account[" + "id:" + getId() + "," + " 账户余额: " +
                        getBalance() + ",月利率：" + getMonthlyInterest() + ", 可透支额: " +
                        overdraft + "]");
            } else {
                System.out.println("Account[" + "id:" + getId() + "," + " 账户余额: " +
                        getBalance() + ",月利率：" + getMonthlyInterest() +
                        ", 超过可透支额的限额,最多可透支: " + overdraft + "]");
            }
        }*/
       /**
        * @Description //TODO 在子类CheckAccount的withdraw方法中需要修改它的值，因此应修改父类的balance属性，定义其为protected。
        **/
        if (balance > amount) {
            balance = balance - amount;
            System.out.println("Account[" + "id:" + getId() + "," + " 账户余额: " +
                    balance + ",月利率：" + getMonthlyInterest() + ", 可透支额: " +
                    overdraft + "]");
        }
        if (balance < amount) {

            if (overdraft > (amount - balance)) {
                this.overdraft = overdraft - (amount - balance);
                setBalance(0);
                System.out.println("Account[" + "id:" + getId() + "," + " 账户余额: " +
                        balance + ",月利率：" + getMonthlyInterest() + ", 可透支额: " +
                        overdraft + "]");
            } else {
                System.out.println("Account[" + "id:" + getId() + "," + " 账户余额: " +
                        balance + ",月利率：" + getMonthlyInterest() +
                        ", 超过可透支额的限额,最多可透支: " + overdraft + "]");
            }
        }
    }
}

