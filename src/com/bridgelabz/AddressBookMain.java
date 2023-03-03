package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        Contact c = new Contact();

        c.firstname = "Debabrata";
        c.lastname = "Sahoo";
        c.address = "Koel Nagar";
        c.city = "Rourkela";
        c.state = "Odisha";
        c.email = "debabratas@xyz.com";
        c.zip = 751025;
        c.phoneno = 7978;

        System.out.println(c.firstname);
        System.out.println(c.lastname);
        System.out.println(c.address);
        System.out.println(c.city);
        System.out.println(c.state);
        System.out.println(c.email);
        System.out.println(c.zip);
        System.out.println(c.phoneno);
    }
}
