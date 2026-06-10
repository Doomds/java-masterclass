package com.doom.section11_abstraction.theory.interface_theory;

enum FlightStrages implements Trackable {GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if (this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }
}

record DragonFly(String name, String type) implements FlightEnabled {
    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class Satellite implements OrbitEarth {
    @Override
    public void achieveOrbit() {
        System.out.println("Orbit achieved!");
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

interface OrbitEarth extends FlightEnabled {
    void achieveOrbit();
}

interface FlightEnabled {
//    public abstract void takeOff(); // public and abstract modifiers sont redondant. il n'est pas obligatoire de les mettre
//    abstract void land(); // Abstract aussi est redondant.
//    void fly(); // C'est la manière qu'on va préférer.
//    // Les déclarations dans une interface sont automatiquement public et abstract. Pas besoin de les définir.

    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    void takeOff();
    void land();
    void fly();
}

interface Trackable {
    void track();
}

public abstract class Animal {

    public abstract void move();
}
