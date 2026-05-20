package com.doom.section10_lists.practice.banking_branch_exo;

import java.util.ArrayList;

public class Bank {
    String name;
    ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String name) {
        if (findBranch(name) != null) {
            return false;
        }
        return branches.add(new Branch(name));
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        if (findBranch(branchName) != null) {
            findBranch(branchName).newCustomer(customerName, initialTransaction);
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {

        if (findBranch(branchName) != null) {
            findBranch(branchName).addCustomerTransaction(customerName, transaction);
            return true;
        }

        return false;
    }

    private Branch findBranch(String name) {
        for (Branch branch : branches) {
            if (branch.name.equals(name)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransaction) {
        if (findBranch(branchName) != null) {
            for (Branch branch : branches) {
                if (branch.name.equals(branchName)) {
                    System.out.println(branch.getCustomers());
                    return true;
                }
            }
        }
        return false;
    }
}
