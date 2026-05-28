package com.doom.section11_abstraction.theory;

public class Dog extends Animal {
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.println(type + " walking");
        } else {
            System.out.println(type + " running");
        }
    }

    @Override
    public void makeNoise() {
        if (type.equals("Wolf")) {
            System.out.print("Howling! ");
        } else {
            System.out.print("Woof! ");
        }
    }
}
