package com.doom.section11_abstraction.practice.abstraction_challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<ProductForSale> products = new ArrayList<>();
        List<OrderItem> orderItems = new ArrayList<>();

        products.add(new Computer("Computer", 999.99, """
                Processor: Intel Core i7
                RAM: 16 Go
                Storage: SSD 512 Go
                Screen: 15.6 pouces
                """));
        products.add(new Computer("Computer", 1299.99, """
                Processor: AMD Ryzen 7
                RAM: 32 Go
                Storage: SSD 1 To
                Screen: 16 pouces
                """));
        products.add(new Computer("Computer", 799.99, """
                Processor: Intel Core i5
                RAM: 8 Go
                Storage: SSD 256 Go
                Screen: 14 pouces
                """));

        products.add(new Chair("Chair", 249.99, """
                Color: Black
                Material: Mesh breathable
                Adjustable armrests: Yes
                Max weight: 120 kg
                """));
        products.add(new Chair("Chair", 179.99, """
                Color: Grey
                Material: Fabric
                Adjustable armrests: No
                Max weight: 100 kg
                """));
        products.add(new Chair("Chair", 329.99, """
                Color: Red/Black
                Material: Premium mesh
                Adjustable armrests: Yes
                Max weight: 150 kg
                """));

        products.add(new CoffeeMachine("Espresso Machine", 179.99, """
                Pressure: 15 bars
                Tank capacity: 1.2 L
                Coffee type: Ground coffee
                Auto shut-off: Yes
                """));
        products.add(new CoffeeMachine("Espresso Machine", 99.99, """
                Pressure: 10 bars
                Tank capacity: 1 L
                Coffee type: Pods
                Auto shut-off: No
                """));
        products.add(new CoffeeMachine("Espresso Machine", 249.99, """
                Pressure: 19 bars
                Tank capacity: 1.5 L
                Coffee type: Ground + Pods
                Auto shut-off: Yes
                """));

        for (ProductForSale product : products) {
            product.showDetails();
        }

        addProductToOrderList(products, orderItems, "Computer", 999.99, 3);
        addProductToOrderList(products, orderItems, "Computer", 799.99, 5);
        addProductToOrderList(products, orderItems, "Chair", 329.99, 8);

    }

    private static boolean addProductToOrderList(List<ProductForSale> products, List<OrderItem> orderList, String type, double price, int quantity) {
        for (ProductForSale product : products) {
            if (product.type.equals(type) && Double.compare(product.price, price) == 0) {
                OrderItem newItem = new OrderItem(quantity, product);
                orderList.add(newItem);
                return true;
            }
        }
        System.out.println("Product not found");
        return false;
    }
}
