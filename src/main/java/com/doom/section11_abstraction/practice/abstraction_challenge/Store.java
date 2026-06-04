package com.doom.section11_abstraction.practice.abstraction_challenge;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private static List<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {

        List<OrderItem> orderItems = new ArrayList<>();

        storeProducts.add(new Computer("Computer", 999.99, """
                Processor: Intel Core i7
                RAM: 16 Go
                Storage: SSD 512 Go
                Screen: 15.6 pouces
                """));
        storeProducts.add(new Computer("Computer", 1299.99, """
                Processor: AMD Ryzen 7
                RAM: 32 Go
                Storage: SSD 1 To
                Screen: 16 pouces
                """));
        storeProducts.add(new Computer("Portable Computer", 799.99, """
                Processor: Intel Core i5
                RAM: 8 Go
                Storage: SSD 256 Go
                Screen: 14 pouces
                """));

        storeProducts.add(new Chair("Chair", 249.99, """
                Color: Black
                Material: Mesh breathable
                Adjustable armrests: Yes
                Max weight: 120 kg
                """));
        storeProducts.add(new Chair("Chair", 179.99, """
                Color: Grey
                Material: Fabric
                Adjustable armrests: No
                Max weight: 100 kg
                """));
        storeProducts.add(new Chair("Chair", 329.99, """
                Color: Red/Black
                Material: Premium mesh
                Adjustable armrests: Yes
                Max weight: 150 kg
                """));

        storeProducts.add(new CoffeeMachine("Espresso Machine", 179.99, """
                Pressure: 15 bars
                Tank capacity: 1.2 L
                Coffee type: Ground coffee
                Auto shut-off: Yes
                """));
        storeProducts.add(new CoffeeMachine("Espresso Machine", 99.99, """
                Pressure: 10 bars
                Tank capacity: 1 L
                Coffee type: Pods
                Auto shut-off: No
                """));
        storeProducts.add(new CoffeeMachine("Espresso Machine", 249.99, """
                Pressure: 19 bars
                Tank capacity: 1.5 L
                Coffee type: Ground + Pods
                Auto shut-off: Yes
                """));

        listProducts();

        addItemToOrder(storeProducts, orderItems, "Computer", 999.99, 3);
        addItemToOrder(storeProducts, orderItems, "Computer", 799.99, 5);
        addItemToOrder(storeProducts, orderItems, "Chair", 329.99, 8);

        printOrder(orderItems);

    }

    private static void listProducts() {
        for (var item :  storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    private static void addItemToOrder(List<OrderItem> order, int orderIndex, int qty) {
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    private static void printOrder(List<OrderItem> order) {

        double salesTotal = 0;

        for (var item : order) {
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }
        System.out.printf("Total sales: $%6.2f %n", salesTotal);
    }
}
