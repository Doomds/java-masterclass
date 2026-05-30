package com.doom.section11_abstraction.practice.abstraction_challenge;

public class CoffeeMachine extends ProductForSale {
    public CoffeeMachine(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(type);
        System.out.println(price + "€");
        System.out.println(description);
    }
}
