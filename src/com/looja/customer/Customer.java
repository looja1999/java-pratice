package com.looja.customer;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private String customerEmail;
    private ArrayList<Integer> transactions;

    public Customer(){
        this.customerName = null;
        this.customerEmail = null;
        this.transactions = new ArrayList<>();
    }

    public Customer(String customerName, String customerEmail, int initialTransaction){
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.transactions = new ArrayList<>();

        // If the transaction is negative than add 0.
        if(initialTransaction < 0){
            this.transactions.add(0);
        } else {
            this.transactions.add(initialTransaction);
        }
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }

    public String getCustomerEmail(){
        return this.customerEmail;
    }

    public void addTransaction(int transaction){
        this.transactions.add(transaction);
    }

    public ArrayList<Integer> getTransactions(){
        return this.transactions;
    }


}
