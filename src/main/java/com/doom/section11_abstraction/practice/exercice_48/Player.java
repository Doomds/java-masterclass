package com.doom.section11_abstraction.practice.exercice_48;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    @Override
    public List<String> write() {
        return new ArrayList<>(List.of(
                this.name,
                String.valueOf(this.hitPoints),
                String.valueOf(this.strength),
                this.weapon
        ));
    }

    @Override
    public void read(List<String> listOfStrings) {
        if (listOfStrings != null && !listOfStrings.isEmpty()) {
            this.name = listOfStrings.get(0);
            this.hitPoints = Integer.parseInt(listOfStrings.get(1));
            this.strength = Integer.parseInt(listOfStrings.get(2));
            this.weapon = listOfStrings.get(3);
        } else {
            System.out.println("the list is empty");
        }
    }

    // Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}
    @Override
    public String toString() {
        return """
                Player{name='%s', hitPoints=%d, strength=%d, weapon='%s'} """
                .formatted(this.name, this.hitPoints, this.strength, this.weapon);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
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
