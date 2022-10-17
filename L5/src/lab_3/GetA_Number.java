package lab_3;
/*
Created by: Dany
Created on 15/10/2022 : 13:15
This is program to
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class GetA_Number {
    public static void main(String[] args) {
        //add scanner for user input
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        //create variables
        int num1, num2, num3;
        String name = "Dany";

        System.out.print("Please enter your name : ");
        name = keyboard.nextLine();

        System.out.print(" Enter a number : ");
        num1 = keyboard.nextInt();

        System.out.print(" Enter a number : ");
        num2 = keyboard.nextInt();

        num3 = num1 * num2;

        System.out.println("USER NAME : " + name);
        System.out.println("First number inputted : " + num1);
        System.out.println("Second number inputted : " + num2);
        System.out.println(num1 + "*" + num2 + "= " + num3);

    }
}
