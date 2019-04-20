package com.zhb.javaSE.banking;

import java.util.Arrays;

public class Bank {
    private Customer customers[];
    private int numberOfCustomers = 0;

    public Bank() {
    }

    public Bank(Customer[] customers) {

    }

    public void addCustomer(String firstName, String lastName) {
        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customers = new Customer[5];
        for (int i = 0; i < customers.length; i++) {
            customers[i] = customer;
        }
        numberOfCustomers++;//导致用户和数组下标倒置
        //System.out.println("Customer["+numberOfCustomers+"]is "+firstName+","+lastName);
    }

    public int getNumberOfCustomers() {

        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        return customers[index];
    }
}
