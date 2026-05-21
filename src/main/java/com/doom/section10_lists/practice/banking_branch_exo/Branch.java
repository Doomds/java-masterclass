package com.doom.section10_lists.practice.banking_branch_exo;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

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
        if (findCustomer(name) != null) {
            return false;
        } else {
            customers.add(new Customer(name, initialTransaction));
            return true;
        }
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        Customer customer = findCustomer(name);

        if (customer == null) {
            return false;
        }
        customer.addTransaction(transaction);
        return true;
    }

    private Customer findCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }
}
