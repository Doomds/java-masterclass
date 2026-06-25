package com.doom.section12_generics.practice.generics_challenge;

public class River extends Line {
    private String name;

    public River(String name, String... location) {
        super(location);
        this.name = name;
    }

    @Override
    protected String getName() {
        return name + " River";
    }
}
