package com.Sainz;

public class Person {
    String firstName;
    String lastName;
    String emailAddress;
    String phoneNumber;

    @Override
    public String toString () {
    return "First name: " + firstName + " " + "Last name: " + lastName + " " + "Email address: " + emailAddress +
            " " + "Phone number: " + phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
