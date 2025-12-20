package calculator_CAO;
/*
Created by: Dany
Created on 02/12/2022 : 13:47
This is program to CAO calculator
*/

import java.util.Scanner;

import static calculator_CAO.Calculator.*;
import static calculator_CAO.logIn.*;
import static calculator_CAO.logUp.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// WELCOME
        System.out.println("\t\t WELCOME TO CAO CALCULATOR");
        System.out.print("------------------------------------\n");

// LOG UP
        LogUp();

// LOG IN
        LogIn();

// INSTRUCTIONS
        System.out.println("\n\t\tINSTRUCTIONS");
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("--------------------");

// EXIT
        System.out.println("Enter 'EXIT' if you want finish it");
        String exit = scanner.nextLine();
        if (exit.toLowerCase().contains("exit")) {
            System.out.println("--------------");
            System.out.println(" EXIT PROGRAM");
            System.out.println("--------------");
            System.exit(0);
        }
// CALCULATOR
        printInfo();

        System.out.println("--------------");
        System.out.println(" EXIT PROGRAM");
        System.out.println("--------------");
    }
}
