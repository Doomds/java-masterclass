package com.doom.section11_abstraction.practice.exercice_47;

import java.util.List;

public class MyLinkedList implements NodeList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (root == null) {
            this.root = newItem;
            return true;
        }

        if (root.compareTo(newItem) > 0) {
            newItem.setNext(root);
            this.root.setPrevious(newItem);
            this.root = newItem;
            return true;
        }

        ListItem current = this.root;

        while (current != null) {
            int comparison = current.compareTo(newItem);

            if (comparison == 0) {
                return false;
            }

            if (comparison < 0) {
                if (current.next() == null) {
                    current.setNext(newItem);
                    newItem.setPrevious(current);
                    return true;
                }
            }

            if (comparison > 0) {
                newItem.setPrevious(current.previous());
                current.previous().setNext(newItem);
                newItem.setNext(current);
                current.setPrevious(newItem);
                return true;
            }

            current = current.next();
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return true;
    }

    @Override
    public void traverse() {

        if (root == null) {
            System.out.println("list is empty");
            return;
        }

        ListItem current = root;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.next();
        }
    }
}
