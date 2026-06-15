package com.doom.section11_abstraction.practice.exercice_47;

public class SearchTree implements NodeList {

    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {


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
