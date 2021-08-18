package com.bridgelabz;

/**************************************************************
 * Purpose : Service class for address book problem.
 * @author Ganesh Gavhad
 * @Version 1.0
 * @since 18-08-2021
 *
 ************************************************************/

import java.util.ArrayList;


    public class AddressbookMain {

        ArrayList<Contact> addressbook = new ArrayList<>();

        /**
         * Display welcome message.
         */
        public void displayWelcome() {
            System.out.println("Welcome to address book");
        }

        /**
         * Creates a contact and adds it to list
         * @param firstName
         * @param lastName
         * @param address
         * @param city
         * @param state
         * @param zip
         * @param phone
         * @param email
         * @return
         * @throws CustomException
         */
        public int createContact(String firstName, String lastName, String address,
                                 String city, String state, String zip, String phone,
                                 String email) throws CustomException {

            Contact contact = new Contact();
            contact.setFirstName(firstName);
            contact.setLastName(lastName);
            contact.setAddress(address);
            contact.setCity(city);
            contact.setState(state);
            contact.setZip(zip);
            contact.setPhone(phone);
            contact.setEmail(email);
            addressbook.add(contact);
            return addressbook.size();
        }
    }
