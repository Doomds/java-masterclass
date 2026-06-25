package com.doom.section12_generics.practice.generics_challenge;

public class Park extends Point {
    private String name;

    public Park(String name, String location) {
        super(location);
        this.name = name;
    }

    @Override
    protected String getName() {
        return name + "National Park";
    }
}
