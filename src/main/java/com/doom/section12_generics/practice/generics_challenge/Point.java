package com.doom.section12_generics.practice.generics_challenge;

import java.util.Arrays;

public abstract class Point implements Mappable {

    private double[] location;
    protected abstract String getName();

    public Point(String location) {
        this.location = Mappable.stringToLatLon(location);
    }

    private String location() {
        return "(" + Arrays.toString(this.location) + ")";
    }

    @Override
    public void render() {
        System.out.println("Render " + getName() + " as POINT " + location());
    }
}
