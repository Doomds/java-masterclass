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
    public boolean addItem(ListItem item) {

        if(root == null) {
            System.out.println("The list is empty");
        }

        return true;
    }

    @Override
    public boolean removeItem() {
        return true;
    }

    @Override
    public void traverse() {

        if(root != null) {
            System.out.println("list is empty");
        }

        ListItem current = root;

        while (current != null) {
            System.out.println(current);
            current.next();
        }

    }
}
