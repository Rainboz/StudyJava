package com.zhb.javaSE.banking.exercise6;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 19-5-17 下午4:39
 **/
public class Bank {
    private Customer customers[];
    private int numberOfCustomers = 0;
    private static Bank bankInstance = new Bank();

    private Bank() {
    }

    public static Bank getBankInstance() {
        return bankInstance;
    }

    public Customer[] addCustomer(Customer... customer) {
//        customer.setFirstName(firstName);
//        customer.setLastName(lastName);
        customers = new Customer[4];
        for (int i = 0; i < customers.length; i++) {
            customers[i] = customer[i];
        }
        numberOfCustomers++;//导致用户和数组下标倒置
        setCustomers(customers);
        return customers;
    }

    public Customer getCustomer(int index) {
        return customers[index];
    }

    public void setCustomers(Customer[] customers) {

        this.customers = customers;
    }
}

