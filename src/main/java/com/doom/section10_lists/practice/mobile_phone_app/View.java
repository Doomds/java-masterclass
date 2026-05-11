package com.doom.section10_lists.practice.mobile_phone_app;

import java.util.Scanner;

public class View {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Welcome to the mobile phone app!");
        System.out.println("Please enter your number: ");
        MobilePhone mobilePhone = new MobilePhone(scanner.nextLine());

        actionMenu(mobilePhone);

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

    private static void actionMenu(MobilePhone mobilePhone) {

        boolean flag = true;

        do {
            printActionMenu();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 0:
                    System.out.println("Bye bye");
                    flag = false;
                    break;
                case 1: mobilePhone.addNewContact(askToAddContact()); break;
                case 2: mobilePhone.updateContact(askToUpdateContact()); break;
                default:
                    System.out.println("Mauvais encodage.");
            }
        } while(flag);
    }

    private static Contact askToAddContact() {
        System.out.println("Veuillez entrer le nom du contact :");
        String name = scanner.nextLine();
        System.out.println("Veuillez entrer le numéro du contact :");
        String phoneNumber = scanner.nextLine();
        return Contact.createContact(name, phoneNumber);
    }

    private static Contact askToUpdateContact() {
        System.out.println("Veuillez entrer le nom du contact :");
        String name = scanner.nextLine();
    }

}
