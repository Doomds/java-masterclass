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
                case 1:
                    mobilePhone.addNewContact(askToAddContact());
                    break;
                case 2:
                    askToUpdateContact(mobilePhone);
                    break;
                case 3:
                    askToShowContact(mobilePhone);
                    break;
                case 4:
                    askToRemoveContact(mobilePhone);
                    break;
                case 5:
                    mobilePhone.printContacts();
                    break;
                default:
                    System.out.println("Mauvais encodage.");
            }
        } while (flag);
    }

    private static void askToRemoveContact(MobilePhone mobilePhone) {

        System.out.println("Quel est le nom du contact que vous voulez supprimer ?");
        String name = scanner.nextLine();

        Contact foundContact = mobilePhone.queryContact(name);

        if (foundContact == null) {
            System.out.println("Le Contact n'existe pas");
        } else {
            if (mobilePhone.removeContact(foundContact)) {
                System.out.println("Contact supprimé avec succès !");
            } else {
                System.out.println("Erreur lors de la suppression.");
            }
        }
    }

    private static void askToShowContact(MobilePhone mobilePhone) {

        System.out.println("Quel est le nom du contact que vous voulez voir ?");
        String name = scanner.nextLine();

        Contact foundContact = mobilePhone.queryContact(name);

        if (foundContact == null) {
            System.out.println("Le Contact n'existe pas");
        } else {
            System.out.printf("Nom : %s | Téléphone : %s",
                    foundContact.getName(),
                    foundContact.getPhoneNumber());
        }
    }

    private static Contact askToAddContact() {

        System.out.println("Veuillez entrer le nom du contact :");
        String name = scanner.nextLine();
        System.out.println("Veuillez entrer le numéro du contact :");
        String phoneNumber = scanner.nextLine();

        return Contact.createContact(name, phoneNumber);
    }

    private static void askToUpdateContact(MobilePhone mobilePhone) {

        System.out.println("Veuillez entrer le nom du contact :");
        String name = scanner.nextLine();

        Contact oldContact = mobilePhone.queryContact(name);
        if (oldContact == null) {
            System.out.println("le contact n'existe pas");
            return;
        }

        System.out.println("Veuillez entrer le nouveau nom du contact :");
        String newName = scanner.nextLine();
        System.out.println("Veuillez entrer le nouveau numéro du contact :");
        String newPhoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhoneNumber);

        if (mobilePhone.updateContact(oldContact, newContact)) {
            System.out.println("Contact updated");
        } else {
            System.out.println("Contact not updated");
        }
    }
}
