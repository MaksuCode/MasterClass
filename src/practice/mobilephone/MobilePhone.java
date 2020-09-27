package practice.mobilephone;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber ;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>() ;
    }

    public boolean addContact(Contact contact){
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already exists!");
            return false ;
        }
        this.myContacts.add(contact) ;
        return true ;
    }

    public boolean modifyContact(Contact contact , String newPhoneNumber) {
        int position = findContact(contact.getName()) ;
        if (position < 0) {
            System.out.println("Contact doesn't exist!");
            return false ;
        }
        contact.setNumber(newPhoneNumber);
        this.myContacts.set(position , contact) ;
        return true ;
    }

    public boolean modifyContact(Contact contact , Contact newContact) {
        int position = findContact(contact) ;
        if (position < 0) {
            System.out.println(contact.getName() + " does not exist!");
            return false ;
        }else if (findContact(newContact.getName()) != -1) {
            System.out.println(newContact.getName() + " already exists!");
            return false ;
        }
        this.myContacts.set(position , newContact) ;
        System.out.println(contact.getName() + " was replaced by " + newContact.getName());
        return true ;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact) ;
        if (position < 0) {
            System.out.println(contact.getName() + " does not exist!");
            return false ;
        }
        this.myContacts.remove(position) ;
        System.out.println(contact.getName() + " was deleted.");
        return true ;
    }

    public String queryContact (Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null ;
    }

    public Contact queryContact (String contactName) {
        int position = findContact(contactName) ;
        if (position >= 0 ) {
            return this.myContacts.get(position) ;
        }
        return null ;
    }

    public void printContacts() {
        System.out.println("Contact List : ");
        for (int i = 0 ; i < this.myContacts.size() ; i++) {
            System.out.println((i+1) + "." + myContacts.get(i).getName()+ "-->"
                                           + myContacts.get(i).getNumber());
        }
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact) ;
    }

    private int findContact(String contactName) {
        for (int i =0 ; i < this.myContacts.size() ; i++ ){
            if (myContacts.get(i).getName().equals(contactName)){
                return i ;
            }
        }
        return -1 ;
    }


    private ArrayList<Contact> getMyContacts() {
        return myContacts;
    }
}
