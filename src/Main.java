import practice.mobilephone.Contact;
import practice.mobilephone.MobilePhone;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in) ;
    private static MobilePhone mobilePhone = new MobilePhone("5426547396") ;

    public static void main(String[] args){

        boolean quit = false ;
        startPhone() ;
        printActions() ;
        while (!quit) {
            System.out.println("\n Enter action : (6 to show available options)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0 :
                    System.out.println("Shutting down");
                    quit= true ;
                    break;
                case 1 :
                    mobilePhone.printContacts() ;
                    break ;
                case 2 :
                    addNewContact() ;
                    break;
                case 3 :
                    updateContact();
                    break;
                case 4 :
                    deleteContact() ;
                    break;
                case 5 :
                    queryContact() ;
                    break;
                case 6 :
                    printActions();
                    break;
            }




        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name : ");
        String name = scanner.nextLine();
        System.out.println("Enter contact number : ");
        String number = scanner.nextLine() ;
        Contact newContact = Contact.createContact(name , number) ;
        if(mobilePhone.addContact(newContact)) {
            System.out.println("New contact added: name = " + newContact.getName() + " , number = " + newContact.getNumber());
        }else
            System.out.println(newContact.getName() + " can not be added!");
    }

    private static void updateContact() {
        System.out.println("Enter the contact name you want to update : ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name) ;
        if (existingContact == null) {
            System.out.println("Contact not found!");
            return;
        }
        System.out.println("Enter new contact name : ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number : ");
        String phoneNumber = scanner.nextLine() ;
        Contact newContact = Contact.createContact(newName , phoneNumber) ;
        mobilePhone.modifyContact(existingContact , newContact) ;
        if (mobilePhone.modifyContact(existingContact , newContact)) {
            System.out.println("Successfully updated the record.");
        }else
            System.out.println("Could not update the record!");
    }

    private static void deleteContact() {
        System.out.println("Enter the contact name you want to delete : ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found!");
            return;
        }
        mobilePhone.removeContact(existingContact) ;
        if (mobilePhone.removeContact(existingContact)) {
            System.out.println("Successfully deleted.");
        }else
            System.out.println("Error deleting!");

    }

    private static void queryContact() {
        System.out.println("Enter the contact name you want to query : ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found!");
        }
        System.out.println("Name : " + existingContact.getName() + " , phone number is : " + existingContact.getNumber());
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions : \npress");
        System.out.println("0 - to shutdown\n" +
                           "1 - to print contacts\n" +
                           "2 - to add new contact\n" +
                           "3 - to update an existing contact\n"+
                           "4 - to delete a contact\n"+
                           "5 - query an existing contact\n"+
                           "6 - to print available options.");
        System.out.println("Chose your action : ");

    }























}
