package emailApp;
/*
Created by: Dany
Created on 18/11/2022 : 14:01
This is program to
*/

import java.util.Scanner;

public class Email {
    static Scanner scanner = new Scanner(System.in);
    private static String firstName;
    private static String lastName;
    private static String department;
    private static String company;
    private static int defaultPasswordLength = 10;
    private static String password;
    private static String email;

    private static void name() {
        System.out.println("----------------");
        System.out.println("ENTER YOUR NAME:");

        firstName = scanner.nextLine();
        lastName = scanner.nextLine();
    }

    private static void department() {
        System.out.println("----------------------");
        System.out.println("\nENTER DEPARTMENT CODE\n1. Sales\n2. Development\n3. Accounting\n0. None\n\nENTER CODE HERE: ");

        int departmentChoice;
        try {
            departmentChoice = scanner.nextInt();
        } catch (Exception e) {
            departmentChoice = 0;
        }

        if (departmentChoice == 1) {
            department = "Sales";
        } else if (departmentChoice == 2) {
            department = "Development";
        } else if (departmentChoice == 3) {
            department = "Accounting";
        } else {
            department = null;
        }
    }

    private static void company() {
        System.out.println("----------------------------------");
        System.out.println("ENTER NAME OF COMPANY(optionally):");
        System.out.print("Do you have a company? <'yes'/'no'>: ");
        String isCompany = scanner.next();
        if (isCompany.toLowerCase().contains("yes")) {
            System.out.println("Enter name of company:");
            company = scanner.next();
        } else {
            company = "Company";
        }
    }

    private static String randomPassword(int length) {
        String passwordSet = "QWERTYUIOPASDFGHJKLZXCVBNM1234567890!@#$%";

        char[] randomPassword = new char[length];

        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            randomPassword[i] = passwordSet.charAt(rand);
        }
        return password = new String(randomPassword);
    }

    private static void newPassword() {
        System.out.println("------------------------");
        System.out.println("Password: " + password);
        System.out.print("If you want change the password, enter 'yes': ");
        String isAnswerYes = scanner.next();
        if (isAnswerYes.toLowerCase().contains("yes")) {
            System.out.println("Enter new password:");
            password = scanner.next();
        }
    }

    private static String email() {
        email = firstName + "." + lastName + "@" + department + "." + company + ".com";
        email = email.toLowerCase();
        return email;
    }
    private static void newEmail() {
        System.out.println("----------------------");
        System.out.println("Your email: " + email);
        System.out.print("If you want change the email, enter 'yes': ");
        String isAnswerYes = scanner.next();
        if (isAnswerYes.toLowerCase().contains("yes")) {
            System.out.println("****@" + department + "." + company + ".com");
            System.out.println("Enter new email:");
            email = scanner.next();
            email = email + "@" + department + "." + company + ".com";
            email.toLowerCase();
        }
    }

    public static void setInfo() {
        name();
        department();
        company();
        randomPassword(defaultPasswordLength);
        newPassword();
        email();
        newEmail();
    }

    public static void getInfo() {
        System.out.println("\n=====================================");
        System.out.println("\tEMAIL");
        System.out.println("Name: " + firstName + " | " + lastName);
        System.out.println("Department: " + department);
        System.out.println("Company: " + company);
        System.out.println("Email:" + email);
        System.out.println("Password: " + password);
        System.out.println("=====================================");
    }
}
