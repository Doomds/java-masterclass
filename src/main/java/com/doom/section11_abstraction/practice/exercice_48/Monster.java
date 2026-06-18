package com.doom.section11_abstraction.practice.exercice_48;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        return new ArrayList<>(List.of(
                this.name,
                String.valueOf(this.hitPoints),
                String.valueOf(this.strength)
        ));
    }

    @Override
    public void read(List<String> listOfStrings) {
        if (listOfStrings != null && !listOfStrings.isEmpty()) {
            this.name = listOfStrings.get(0);
            this.hitPoints = Integer.parseInt(listOfStrings.get(1));
            this.strength = Integer.parseInt(listOfStrings.get(2));
        } else {
            System.out.println("the list is empty");
        }
    }

    // Monster{name='Werewolf', hitPoints=20, strength=40}
    @Override
    public String toString() {
        return """
                Player{name='%S', hitPoints=%d, strength=%d} """
                .formatted(this.name, this.hitPoints, this.strength);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
