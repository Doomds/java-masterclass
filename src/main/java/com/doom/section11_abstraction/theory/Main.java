package com.doom.section11_abstraction.theory;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Wolf", "big", 100);
        dog.makeNoise();

        doAnimalStuff(dog);
    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
    }
}
