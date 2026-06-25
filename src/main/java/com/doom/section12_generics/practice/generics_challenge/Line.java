package com.doom.section12_generics.practice.generics_challenge;

import java.util.Arrays;

public abstract class Line implements Mappable {

    private double[][] locations;
    protected abstract String getName();

    public Line(String... locations) {
        this.locations = new double[locations.length][];
        int index = 0;
        for (var l : locations) {
            this.locations[index++] = Mappable.stringToLatLon(l);
        }
    }

    private String locations() {
        return "(" + Arrays.deepToString(this.locations) + ")";
    }

    @Override
    public void render() {
        System.out.println("Render " + getName() + " as LINE " + locations());
    }
}
