package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        System.out.println("Enter number of persons :");
        int person = sc.nextInt();
        Contact[] array = new Contact[person];
        int result = 0;
        while (result != 4) {
            System.out.println("What to perform");
            System.out.println("1.Add 2.Edit 3.Print 4.Stop");
            result = sc.nextInt();
            switch (result) {
                case 1:
                    Add(person, array);
                    break;
                case 2:
                    Edit(person, array);
                    break;
                case 3:
                    Print(person, array);
                    break;
                default:
                    Stop();
                    break;

            }
        }
    }

    public static void Add(int person, Contact[] array) {
        for (int i = 0; i < person; i++) {
            Contact c = new Contact();
            System.out.println("Enter " + (i + 1) + " Person name:");
            c.setFirstname(sc.next());
            System.out.println("Enter " + (i + 1) + " Person lastname:");
            c.setLastname(sc.next());
            System.out.println("Enter " + (i + 1) + " Person address:");
            c.setAddress(sc.next());
            System.out.println("Enter " + (i + 1) + " Person city:");
            c.setCity(sc.next());
            System.out.println("Enter " + (i + 1) + " Person state:");
            c.setState(sc.next());
            System.out.println("Enter " + (i + 1) + " Person zip code:");
            c.setZip(sc.nextInt());
            System.out.println("Enter " + (i + 1) + " Person contact:");
            c.setPhoneno(sc.nextInt());
            System.out.println("Enter " + (i + 1) + " Person email:");
            c.setEmail(sc.next());

            array[i] = c;
        }
    }

    public static void Edit(int person, Contact[] array) {
        System.out.println("what you want to edit :");
        System.out.println("firstname, lastname, address, state, contact,zip,email,phoneno");
        String toEdit = sc.next();
        if (toEdit.equals("firstname")) {
            System.out.println("whose first name :");
            String oldFirstName = sc.next();
            for (int j = 0; j < person; j++) {
                if (oldFirstName.equals(array[j].getFirstname())) {
                    System.out.println("Enter new first name :");
                    String newFirstName = sc.next();
                    array[j].setFirstname(newFirstName);
                }
            }
        }
        if (toEdit.equals("lastname")) {
            System.out.println("whose last name :");
            String oldLastName = sc.next();
            for (int j = 0; j < person; j++) {
                if (oldLastName.equals(array[j].getFirstname())) {
                    System.out.println("enter new Lastname :");
                    array[j].setLastname(sc.next());
                }
            }
        }
        if (toEdit.equals("address")) {
            System.out.println("whose address :");
            String oldaddress = sc.next();
            for (int j = 0; j < person; j++) {
                if (oldaddress.equals(array[j].getFirstname())) {
                    System.out.println("Enter new address :");
                    array[j].setAddress(sc.next());
                }
            }
        }
        if (toEdit.equals("city")) {
            System.out.println("whose city :");
            String oldcity = sc.next();
            for (int j = 0; j < person; j++) {
                if (oldcity.equals(array[j].getFirstname())) {
                    System.out.println("Enter new city :");
                    array[j].setCity(sc.next());
                }
            }
        }
        if (toEdit.equals("state")) {
            System.out.println("whose state :");
            String oldstate = sc.next();
            for (int j = 0; j < person; j++) {
                if (oldstate.equals(array[j].getFirstname())) {
                    System.out.println("Enter new state :");
                    array[j].setState(sc.next());
                }
            }
        }
        if (toEdit.equals("phone number")) {
            System.out.println("whose phone number:");
            String oldphoneno = sc.next();
            for (int j = 0; j < person; j++) {
                if (oldphoneno.equals(array[j].getFirstname())) {
                    System.out.println("Enter new phone number :");
                    array[j].setPhoneno(sc.nextInt());
                }
            }
        }
        if (toEdit.equals("zipcode")) {
            System.out.println("whose zip code:");
            String oldzip = sc.next();
            for (int j = 0; j < person; j++) {
                if (oldzip.equals(array[j].getFirstname())) {
                    System.out.println("Enter new zip code :");
                    array[j].setZip(sc.nextInt());
                }
            }
        }
    }

    public static void Print(int person, Contact[] array) {
        for (int i = 0; i < person; i++)
            System.out.println(array[i].getFirstname() + " " + array[i].getLastname() + " " + array[i].getAddress() + " "
                    + array[i].getCity() + "  " + array[i].getState() + " " + array[i].getZip() + " "
                    + array[i].getPhoneno() + " " + array[i].getEmail());
    }

    public static void Stop() {
        System.out.println("Thank you");
    }
}
