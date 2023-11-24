package com.looja.bank;

import java.util.ArrayList;
import com.looja.Branch.Branch;

public class Bank {
    private final String bankName = "Bank of Darwin";
    private ArrayList<Branch> branches;

    public Bank(){
        this.branches = new ArrayList<>();
    }

    public String getBankName(){
        return this.bankName;
    };

    public boolean addBranches(String branchName){
        System.out.println("HELLO");
        for(Branch b : branches) {
            if (b.getBranchName().equals(branchName)) {
                System.out.println("Branch Name exists");
                return false;
            }
        }

        this.branches.add(new Branch(branchName));

        System.out.println(this.branches);
        return true;
    }

    public boolean getBranches(){
        if(this.branches.isEmpty()){
            System.out.println("NOTHING FOUND");
            return  false;
        }

        for(Branch b : branches){
            System.out.println(b.getBranchName());
            return true;
        }

        return false;
    }

    public Branch getBranch(String branchName){
        for(Branch b : branches){
            if(b.getBranchName().equals(branchName)){
                return b;
            }
        };

        return null;
    }
}
