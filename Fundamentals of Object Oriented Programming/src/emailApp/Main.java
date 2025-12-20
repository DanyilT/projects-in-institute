package emailApp;
/*
Created by: Dany
Created on 18/11/2022 : 14:01
This is program to test if email is working and to launch app. Create objects
*/

import javax.swing.*;
import java.util.Scanner;

import static emailApp.Email.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("PLEASE ENTER A CHOICE FOR DATA ENTRY");
        System.out.println("1: EMAIL SETUP");
        System.out.println("2: HR PERSONAL INFORMATION");

        int dataChoice = scanner.nextInt();

        if (dataChoice == 1) {
            Email.setInfo();
            Email.getInfo();
        } else if (dataChoice == 2) {
            HR_Department.setInfo();
            HR_Department.getInfo();
        } else {
            System.out.println("NOTHING REQUESTING");
            System.out.println("-------------------");
        }
    }
}
