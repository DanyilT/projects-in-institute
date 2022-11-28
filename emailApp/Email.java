package emailApp;
/*
Created by: Dany
Created on 18/11/2022 : 14:01
This is program to
*/

import java.util.Scanner;

public class Email {

    //to do

//create properties for email
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String email;
    private int defaultPasswordLength = 10;
    private String companySuffix = "company.com";

//constructors
    public Email(){} //default constructor
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Name : " + firstName + " | " + lastName);
//Call  method asking for department - return department
        this.department = setDepartment();
        System.out.println("Department : " + this.department);
//Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password : " + this.password);
//Combine elements to generate email
        this.email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
        System.out.println("Your email : " + this.email);
    } //alternative constructor

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//Next - ask for department - call a method asking for department - return department
//We want this to be private and we want to return a string
    private String setDepartment() {
//Create a scanner to return value
        Scanner scanner = new Scanner(System.in);
//Need to get information
        System.out.println("\nENTER DEPARTMENT CODE\n1. Sales\n2. Development\n3. Accounting\n0. None\n\nENTER CODE HERE: ");
//Create variables for department choice
        int depChoice = scanner.nextInt();
//If the department choice is equal to 1 then we're going o return he word "sales"
        if (depChoice == 1) {
            return "Sales";
        }
//Else if the department choice equal to 2 or 3
        else if (depChoice == 2) {
            return "Development";
        }
        else if (depChoice == 3) {
            return "Accounting";
        }
        else {
            return null;
        }
    }
//generate a random password
    private String randomPassword(int length) {
        String passwordSet = "QWERTYUIOPASDFGHJKLZXCVBNM1234567890!@#$%";
//Set the mailbox capacity

//Array of characters, will see the password option as individual chars
        char[] password = new char[length];
//Iterate through the values of the length for each value inside length
//Grab a value inside array
        for (int i = 0; i < length; i++) {
//Casting char length as a int
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }


    //create a password

}
