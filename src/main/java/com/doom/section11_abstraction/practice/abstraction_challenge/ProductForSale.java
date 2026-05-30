package com.doom.section11_abstraction.practice.abstraction_challenge;

public abstract class ProductForSale {

    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return price * quantity;
    }

    public void printPricedItem(int quantity) {
        System.out.println("Item:" + type + " | Quantity: " + quantity + " | unit price: " + price);
    }

    public abstract void showDetails();
}
