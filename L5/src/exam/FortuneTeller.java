package exam;
/*
Created by: Dany
Created on 30/01/2023 : 11:24
This is program to
*/

//import library
import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {

        //create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        //variable
        int choice;

        System.out.println("Welcome to the Fortune Teller App");
        // Prompt the user to pick a number 1, 2, or 3
        System.out.println("Enter a number 1, 2 or 3 to see your fortune:");

        choice = scanner.nextInt();

        // Use a switch statement to determine the fortune based on the user's input
        switch (choice) {
            //if 1
            case 1:
                System.out.println("Expect Rain");
                break;
            //if 2
            case 2:
                System.out.println("You will get an 'A' on a test");
                break;
            //if 3
            case 3:
                System.out.println("You will be rich");
                break;
            //default
            default:
                System.out.println("You will have very good luck");
                break;
        }
    }//main
}// class
