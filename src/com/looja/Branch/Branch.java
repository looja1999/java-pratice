package com.looja.Branch;

import com.looja.customer.Customer;
import java.util.ArrayList;
import java.util.Objects;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(){
        this.branchName = null;
        this.customers = new ArrayList<>();
    }

    public Branch(String branchName){
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }


    public void setBranchName(String branchName){
        this.branchName = branchName;
    }

    public String getBranchName(){
        return this.branchName;
    }

    public boolean addCustomers(String customerName, String customerEmail, int initalTransaction){

        // Checking if the customer exists or not
        for(Customer c : customers){
            if(c.getCustomerEmail().equals(customerEmail)){
                System.out.println("Customer email already exists");
                return false;
            }
        }

        customers.add(new Customer(customerName, customerEmail, initalTransaction));
        System.out.println("New customer added to the database.");

        return true;
    }

    public Customer getCustomer(String customerEmail){;
        Customer cust = null;

        for(Customer c : customers){
            if(c.getCustomerEmail().equals(customerEmail)){
                cust = c;
            }
        }

        return cust;
    }

    public boolean addCustomerTransaction(String customerEmail, int transaction){
        Customer cust = this.getCustomer(customerEmail);

        if(cust != null){
            cust.addTransaction(transaction);
            return false;
        }

        return true;
    }

    public void displayCustomers(){
        for(Customer c : this.customers){
            System.out.println(c.getCustomerName() + c.getCustomerEmail() + c.getTransactions().toString());
        }
    }

}
