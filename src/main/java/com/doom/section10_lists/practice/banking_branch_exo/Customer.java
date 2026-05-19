package com.doom.section10_lists.practice.banking_branch_exo;

import java.util.ArrayList;

public class Customer {

    String name;
    ArrayList<Double> transactions;

    public Customer(String name, double initialDeposit) {
        this.name = name.toUpperCase();
        this.transactions = new ArrayList<>(500);
        transactions.add(initialDeposit);
    }
}
