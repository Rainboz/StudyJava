package com.zhb.javaSE.banking;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        System.out.println("Creating the customer " + firstName + " " + lastName + ".");
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Account getAccount() {
        System.out.println("Customer [" + firstName + ", " + lastName + "] has a balance of " + account.getBalance());
        return account;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccount(Account account) {
        //account.getBalance();
        //实验5
        // System.out.println("Creating her account with a " + account.getBalance() + " balance.");
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", account=" + account +
                '}';
    }
}
