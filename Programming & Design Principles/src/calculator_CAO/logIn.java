package calculator_CAO;
/*
Created by: Dany
Created on 05/12/2022 : 10:05
This is program to
*/

import java.util.Scanner;

import static calculator_CAO.logUp.*;

public class logIn {
    static Scanner scanner = new Scanner(System.in);
    private static String guessUsername, guessPassword;
    public static void LogIn() {
        System.out.println("\t\t\tLOG IN\n");

        System.out.println("||ENTER USERNAME");
        guessUsername = scanner.nextLine();

        int i = 0;
        while ((i < 2) && (!guessUsername.equals(username))) {
            System.out.println("Incorrect, please enter your username again ");
            guessUsername = scanner.nextLine();
            i++;
        }
        if((guessUsername.equals(username))) {
            System.out.println("\nWelcome "+ username +"!");
        } else {
            System.out.println("You have entered your username wrong three times");
            System.out.println("Please try again in a few minutes");
            System.exit(0);
        }

        System.out.println("ENTER PASSWORD");
        guessPassword = scanner.nextLine();

        i = 0;
        while((i < 2) && (!guessPassword.equals(password))) {
            System.out.println("Incorrect, please enter your password again");
            guessPassword = scanner.nextLine();
            i++;
        }
        if((guessPassword.equals(password))) {
            System.out.println("\nWelcome To CAO\nLogged in Successfully as " + username);
        } else {
            System.out.println("You have entered your password wrong three times");
            System.out.println("Please try again in a few minutes");
            System.exit(0);
        }
// for loop ( count 3) to check if userName/ password is correct
    }
}
