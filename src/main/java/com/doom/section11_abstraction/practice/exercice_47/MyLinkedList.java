package com.doom.section11_abstraction.practice.exercice_47;

public class MyLinkedList implements NodeList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return null;
    }

    @Override
    public boolean addItem() {
        return true;
    }

    @Override
    public boolean removeItem() {
        return true;
    }

    @Override
    public void traverse() {

    }
}
