package com.doom.section11_abstraction.theory.interface_theory;

interface FlightEnabled {
//    public abstract void takeOff(); // public and abstract modifiers sont redondant. il n'est pas obligatoire de les mettre
//    abstract void land(); // Abstract aussi est redondant.
//    void fly(); // C'est la manière qu'on va préférer.
//    // Les déclarations dans une interface sont automatiquement public et abstract. Pas besoin de les définir.

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
