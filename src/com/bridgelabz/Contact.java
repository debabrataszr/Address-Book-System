package com.bridgelabz;

public class Contact {
    String firstname, lastname, address, city, state, email;
    int zip, phoneno;

    public  Contact(String firstname,String lastname, String address, String state, int zip,
                              int phoneno, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.state = state;
        this.zip = zip;
        this.phoneno = phoneno;
        this.email = email;
    }
}
