package com.doom.section10_lists.practice.banking_app;

public class Main {
    public static void main(String[] args) {
        Customer bob = new Customer("Bob S", 1000.0);
        System.out.println(bob);

        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Jane Austen", 500.0);
        System.out.println(bank);
    }
}
