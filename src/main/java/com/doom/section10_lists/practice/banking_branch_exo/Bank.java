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
        if (findBranch() != null) {
            return false;
        }
        return branches.add(new Branch(name));
    }

    //TODO
    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        if (findBranch() != null) {
            return false;
        }

        return true;
    }

    //TODO
    public boolean addCustomerTransaction(String bankName, String customerName, double transaction) {

        if (findBranch() != null) {}

        return false;
    }

    private Branch findBranch() {
        for (Branch branch : branches) {
            if (branch.name.equals(name)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransaction) {
        if (findBranch() != null) {
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
