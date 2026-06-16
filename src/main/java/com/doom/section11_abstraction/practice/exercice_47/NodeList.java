package com.doom.section11_abstraction.practice.exercice_47;

import java.awt.*;

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void  traverse();
}
