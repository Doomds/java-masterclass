package com.doom.section11_abstraction.practice.abstraction_challenge;

public class Computer extends ProductForSale {
    public Computer(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(type);
        System.out.println(price + "€");
        System.out.println(description);
    }
}
