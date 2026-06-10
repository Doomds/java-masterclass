package com.doom.section11_abstraction.theory.interface_theory;

public class Test {
    public static void main(String[] args) {
        inFlight(new Jet());
    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }
}


