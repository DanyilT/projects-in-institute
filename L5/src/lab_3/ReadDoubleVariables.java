package lab_3;
/*
Created by: Dany
Created on 15/10/2022 : 10:16
This is program to
*/

import java.util.Scanner;

public class ReadDoubleVariables {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Declare two double variables for price1 and price2
        double price1, price2;

        // ALWAYS prompt the user for a value first
        // then read from the keyboard

        System.out.print("Please enter a value for price 1: ");
        price1 = keyboard.nextDouble();
        System.out.print("Please enter a value for price 2: ");
        price2 = keyboard.nextDouble();

        System.out.println("______________________________________________\n\tThe value entered for price 1 is "  + price1);
        System.out.println("\tThe value entered for price 2 is " + price2);
    }
}
