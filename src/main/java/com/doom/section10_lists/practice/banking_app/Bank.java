package com.doom.section10_lists.practice.banking_app;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    public void addCustomer(Customer customer) {
        if (customers.contains(customer)) {
            System.out.println("Customer already exists");
        } else {
            customers.add(customer);
            System.out.println("customer added to the list");
        }
    }

    private Customer getCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.print("Customer not found");
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {
        if (getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("New customer added to the list: " + customer);
        }
    }
}
