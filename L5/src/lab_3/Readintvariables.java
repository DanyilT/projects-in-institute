package lab_3;
/*
Created by: Dany
Created on 15/10/2022 : 09:58
This is program to
*/

import java.util.Scanner;

public class Readintvariables {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int length, breadth;

        System.out.print("Enter a value for length: ");
        length = keyboard.nextInt();

        System.out.print("Enter a value for breadth: ");
        breadth = keyboard.nextInt();

        System.out.println("____________________________________\n\tLength value entered was: "  + length);
        System.out.println("\tBreadth value entered was: " + breadth);

    }
}
