package exam;
/*
Created by: Dany
Created on 30/01/2023 : 09:15
This is program to
*/

//import library
import java.util.Scanner;

public class IntegerSum {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter three integers
        System.out.print("Enter the first integer: ");
        //variable
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        //variable
        int num2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        //variable
        int num3 = input.nextInt();

        // Calculate the sum of the integers
        //variable
        int sum = num1 + num2 + num3;

        // Print the result
        System.out.println("The sum of the three integers is: " + sum);
    }//main
}//class
