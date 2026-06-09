package com.doom.section11_abstraction.theory.interface_theory;

public class Truck implements Trackable {
    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
    }
}
