package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {


    private Map<String, Contact> contacts;

    public Phonebook() {

        contacts = new HashMap<>();
    }


    public void addContact(Contact contact) {

        contacts.put(contact.getCode(), contact);
    }


    public void deleteContact(String code) {

        contacts.remove(code);
    }


    public void showPhonebook() {

        for (Contact contact : contacts.values()) {
            contact.showContactDetails();
        }
    }


    public Map<String, Contact> getData() {
        return contacts;
    }
}
