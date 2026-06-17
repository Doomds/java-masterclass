package com.doom.section11_abstraction.practice.exercice_47;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return rightLink;
    }

    @Override
    ListItem setNext(ListItem next) {
        return rightLink = next;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setPrevious(ListItem previous) {
        return leftLink = previous;
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null) {
            String thisValue = (String) this.getValue();
            String otherValue = (String) item.getValue();

            return thisValue.compareTo(otherValue);
        } else {
            return -1;
        }
    }
}
