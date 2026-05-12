package com.doom.section10_lists.practice.banking_app;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        if (customers.contains(customer)) {
            System.out.println("Customer already exists");
        } else {
            customers.add(customer);
            System.out.println("customer added to the list");
        }
    }
}
