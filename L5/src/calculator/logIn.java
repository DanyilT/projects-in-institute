package calculator;
/*
Created by: Dany
Created on 05/12/2022 : 10:05
This is program to
*/

import java.util.Scanner;

import static calculator.logUp.password;
import static calculator.logUp.username;

public class logIn {
//Create 2 new variable to hold the guess password and Username
    public static String guessUsername;
    public static String guessPassword;
    public static void LogIn() {
        Scanner scanner = new Scanner(System.in);
//Prompt the user to enter a username.
        System.out.println("\t\t\tLOG IN\n");

        System.out.println("||ENTER USERNAME");
        guessUsername = scanner.nextLine();

//Create while loop, set loop continuation to count < 2
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

//Prompt the user for the password
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
