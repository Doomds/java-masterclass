package com.doom.section10_lists.practice.banking_branch_exo;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

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
        Branch branch = findBranch(branchName);

        if (branch != null) {
            return branch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    private Branch findBranch(String name) {
        for (Branch branch : branches) {
            if (branch.getName().equals(name)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransaction) {
        Branch branch = findBranch(branchName);

        if (branch == null) {
            return false;
        }

        System.out.println("Customer details for branch " + branch.getName());
        ArrayList<Customer> customers = branch.getCustomers();

        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.println("Customer: " + customer.getName() + "[" + (i + 1) + "]");

            if (printTransaction) {
                System.out.println("Transactions");
                ArrayList<Double> transactions = customer.getTransactions();

                for (int j = 0; j < transactions.size(); j++) {
                    System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                }
            }
        }
        return true;
    }
}
