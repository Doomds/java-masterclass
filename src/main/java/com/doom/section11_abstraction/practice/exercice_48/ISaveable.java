package com.doom.section11_abstraction.practice.exercice_48;

import java.util.List;

public interface ISaveable {

    List<String> write();
    void read(List<String> listOfStrings);
}
