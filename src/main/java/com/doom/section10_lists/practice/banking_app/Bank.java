package com.doom.section10_lists.practice.banking_app;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + "\'" +
                ", customers=" + customers +
                "}";
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

    public void addTransaction(String customerName, double amount) {
        Customer customer = getCustomer(customerName);

        if (customer != null) {
            customer.transactions().add(amount);
        }
    }

    public void printStatement(String customerName) {
        Customer customer = getCustomer(customerName);
        if (customer == null) {
            return;
        }

        System.out.println("-".repeat(30));
        System.out.println("Customer Name:" + customer.name());
        System.out.println("Transactions:");
        for (double transaction : customer.transactions()) {
            System.out.printf("$%10.2f (%s)%n", transaction, transaction < 0 ? "debit" : "credit");
        }
    }
}
