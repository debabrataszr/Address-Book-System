package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address Book Program");

        System.out.println("Enter number of persons :");
        int person = sc.nextInt();
        Contact[] array = new Contact[person];
        for (int i = 0; i < person; i++) {
            System.out.println("Enter " + (i + 1) + " Person name-");
            String firstname = sc.next();
            System.out.println("Enter " + (i + 1) + " Person lastname:");
            String lastname = sc.next();
            System.out.println("Enter " + (i + 1) + " Person address:");
            String address = sc.next();
            System.out.println("Enter " + (i + 1) + " Person state:");
            String state = sc.next();
            System.out.println("Enter " + (i + 1) + " Person zip code:");
            int zip = sc.nextInt();
            System.out.println("Enter " + (i + 1) + " Person contact:");
            int phoneno = sc.nextInt();
            System.out.println("Enter " + (i + 1) + " Person email:");
            String email = sc.next();
            Contact c = new Contact(firstname, lastname, address, state, zip, phoneno, email);
            array[i] = contact;
        }

        for ( int i = 0; i < person; i++) {
            System.out.println(array[i].firstname + " " + array[i].lastname + " " + array[i].address + " "
                    + array[i].state + " " + array[i].zip + " " + array[i].phoneno + " " + array[i].email);
        }
    }
}
