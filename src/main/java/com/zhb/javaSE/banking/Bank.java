package com.zhb.javaSE.banking;

import java.util.Arrays;

public class Bank {
    private Customer customers[];
    private int numberOfCustomers = 0;

    public Bank() {
    }

    public Bank(Customer[] customers) {

    }

    public Customer[] addCustomer(String firstName, String lastName) {
        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customers = new Customer[4];
        for (int i = customers.length-1; i > 0; i--) {
            customers[i] = customer;
        }
        numberOfCustomers++;//导致用户和数组下标倒置
        System.out.println("Customer["+numberOfCustomers+"]is "+firstName+","+lastName);
        setCustomers(customers);
        return customers;
    }

    public int getNumberOfCustomers() {

        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        return customers[index];
    }

    public void setCustomers(Customer[] customers) {

        this.customers = customers;
    }

    public void setNumberOfCustomers(int numberOfCustomers) {
        this.numberOfCustomers = numberOfCustomers;
    }
}
