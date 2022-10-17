package lab_3;
/*
Created by: Dany
Created on 15/10/2022 : 18:57
This is program to
*/

import java.util.Scanner;

public class ReadCharVariables {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String input;	//declare a String variable
        char letter;	//declare a character variable letter

        // Prompt for and accept a single character typed in
        // at the keyboard and assign it to the variable input
        System.out.print("Are you happy? (Y=yes, N=no): ");
        input = keyboard.nextLine();

        // Convert the String "Y" or "N" to a character 'Y' or 'N'
        letter = input.charAt(0);
        System.out.println("Letter entered was " + letter);

    }
}
