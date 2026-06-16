package com.doom.section11_abstraction.practice.exercice_47;

public class SearchTree implements NodeList {

    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            this.root = newItem;
            return true;
        }

        ListItem current = this.root;
        while (current != null) {
            int comparison = current.compareTo(newItem);
            if (comparison < 0) {
                // newItem est plus grand, on va à droite
                if (current.next() != null) {
                    current = current.next();
                } else {
                    current.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem est plus petit, on va à gauche
                if (current.previous() != null) {
                    current = current.previous();
                } else {
                    current.setPrevious(newItem);
                    return true;
                }
            } else {
                // Égalité, on n'ajoute pas
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item == null) {
            return false;
        }

        ListItem current = this.root;
        ListItem parent = current; // On garde une trace du parent

        while (current != null) {
            int comparison = current.compareTo(item);
            if (comparison < 0) {
                parent = current;
                current = current.next();
            } else if (comparison > 0) {
                parent = current;
                current = current.previous();
            } else {
                // Élément trouvé, on l'enlève
                performRemoval(current, parent);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        // Cas 1 : Pas d'enfant gauche
        if (item.previous() == null) {
            if (parent.next() == item) {
                parent.setNext(item.next());
            } else if (parent.previous() == item) {
                parent.setPrevious(item.next());
            } else {
                this.root = item.next();
            }
            // Cas 2 : Pas d'enfant droit
        } else if (item.next() == null) {
            if (parent.next() == item) {
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                parent.setPrevious(item.previous());
            } else {
                this.root = item.previous();
            }
            // Cas 3 : Deux enfants (on cherche le successeur le plus petit à droite)
        } else {
            ListItem current = item.next();
            ListItem leftmostParent = item;
            while (current.previous() != null) {
                leftmostParent = current;
                current = current.previous();
            }

            item.setValue(current.getValue());
            if (leftmostParent == item) {
                item.setNext(current.next());
            } else {
                leftmostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
            return;
        }

        // Parcours Inorder récursif
        if (root.previous() != null) {
            traverse(root.previous());
        }
        System.out.println(root.getValue());
        if (root.next() != null) {
            traverse(root.next());
        }
    }
}
