package com.zhb.javaSE.banking;

public class Customer extends Account{
    private String firstName;
    private String lastName;
    private Account account;

    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        System.out.println("Creating the customer  "+firstName+" "+lastName+".");
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Account getAccount() {
        System.out.println("Customer ["+firstName+", "+lastName+"] has a balance of "+"");
        return account;
    }
    public void setAccount(Account account) {
        //account.getBalance();

        System.out.println("Creating her account with a "+""+" balance.");
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
