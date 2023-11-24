package com.looja;

import com.looja.bank.Bank;
import com.looja.Branch.Branch;
import com.looja.customer.Customer;

public class Main {
   public static void main(String[] args){
      Bank darwin = new Bank();
      System.out.println(darwin.getBankName());

      // Adding branch
      darwin.addBranches("Fannie Bay");
      darwin.addBranches("Darwin City");
      darwin.addBranches("Palmerston");

      // Adding customers to the branch
      Branch fannieBay = darwin.getBranch("Fannie Bay");
      System.out.println(fannieBay);
      fannieBay.addCustomers("Looja", "test@gmail.com", 100);
      Customer looja = fannieBay.getCustomer("test@gmail.com");
      looja.addTransaction(10);

      System.out.println(fannieBay.addCustomerTransaction("test@gmail.com", 1000));
      System.out.println(looja.getTransactions());

   }
}


