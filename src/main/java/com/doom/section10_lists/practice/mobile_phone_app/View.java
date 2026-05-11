package com.doom.section10_lists.practice.mobile_phone_app;

import java.util.Scanner;

public class View {
    private static Scanner scanner = new Scanner(System.in);
    static void main(String[] args) {

        printActionMenu();

    }

    private static void printActionMenu() {
        String text = """
                Contact app
                0 - quitter l'application
                1 - ajouter un contact
                2 - modifier un contact
                3 - afficher un contact
                4 - supprimer un contact
                5 - afficher la liste de contacts
                """;
        System.out.println(text);
    }

    private static void actionMenu() {

        boolean flag = true;

        do {
            printActionMenu();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1: MobilePhone.
            }
        } while(flag);
    }

}
