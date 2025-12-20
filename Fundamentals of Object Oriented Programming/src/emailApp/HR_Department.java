package emailApp;
/*
Created by: Dany
Created on 18/11/2022 : 14:02
This is program to
*/

import java.util.Scanner;

public class HR_Department extends Email {
    static Scanner scanner = new Scanner(System.in);
    private static String firstName;
    private static String lastName;
    private static String countryCode;
    private static int phoneNumber;
    private static String ppsn;
    private static double salary;

    public static void setInfo() {
        System.out.println("-----------------------");
        System.out.println("ENTER YOUR NAME:");
        setFirstName(firstName = scanner.nextLine());
        setLastName(lastName = scanner.nextLine());
        System.out.println("-----------------------");
        System.out.println("ENTER YOUR PHONE NUMBER:");
        System.out.print("Enter your country code: ");
        setCountryCode(countryCode = scanner.nextLine());
        System.out.print("Enter your number: ");
        try {
            setPhoneNumber(phoneNumber = scanner.nextInt());
        } catch (Exception e) {
            setPhoneNumber(phoneNumber);
        }
        System.out.println("-----------------------");
        System.out.println("ENTER YOUR PPSn:");
        setPpsn(ppsn = scanner.next());
        System.out.println("ENTER YOUR SALARY:");
        try {
            setSalary(salary = scanner.nextDouble());
        } catch (Exception e) {
            setSalary(salary);
        }
    }

    public static void getInfo() {
        System.out.println("=========================");
        System.out.println("\n\t STAFF INFO");
        System.out.println("Name: " + getFirstName() + " | " + getLastName());
        System.out.println("Phone number: " + getCountryCode() + getPhoneNumber());
        System.out.println("PPSn: " + getPpsn());
        System.out.println("Salary: " + getSalary());
        System.out.println("=========================");
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        HR_Department.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        HR_Department.lastName = lastName;
    }

    public static String getCountryCode() {
        return countryCode;
    }

    public static void setCountryCode(String countryCode) {
        HR_Department.countryCode = countryCode;
    }

    public static int getPhoneNumber() {
        return phoneNumber;
    }

    public static void setPhoneNumber(int phoneNumber) {
        HR_Department.phoneNumber = phoneNumber;
    }

    public static String getPpsn() {
        return ppsn;
    }

    public static void setPpsn(String ppsn) {
        HR_Department.ppsn = ppsn;
    }

    public static double getSalary() {
        return salary;
    }

    public static void setSalary(double salary) {
        HR_Department.salary = salary;
    }
}
