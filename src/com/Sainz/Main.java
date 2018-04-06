package com.Sainz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Person newPerson;

        ArrayList<Person> persons = new ArrayList();

        for (int x=1; x<=1; x++)

        {
            newPerson = new Person();
            System.out.println("Enter details about yourself");
            System.out.println("Enter your first name:");
            newPerson.setFirstName(scan.nextLine());
            System.out.println("Enter your last name:");
            newPerson.setLastName(scan.nextLine());
            System.out.println("Enter your email address");
            newPerson.setEmailAddress(scan.nextLine());
            System.out.println("Enter your phone number");
            newPerson.setPhoneNumber(scan.nextLine());

            persons.add(newPerson);
        }

            for (Person eachPerson: persons)

            {
                System.out.println("=======");
                System.out.println("Enter details about yourself:" + " " + eachPerson.toString());
            }

    }
}
