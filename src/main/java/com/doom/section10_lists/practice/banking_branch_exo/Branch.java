package com.doom.section10_lists.practice.banking_branch_exo;

import java.util.ArrayList;

public class Branch {
    String name;
    ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initialTransaction) {
        return newCustomer(name, initialTransaction);
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        return addCustomerTransaction(name, transaction);
    }

    private Customer findCustomer(String name) {
        for (Customer customer : customers) {
            if (customers.contains(customer)) {
                return customer;
            }
        }
        return null;
    }
}
