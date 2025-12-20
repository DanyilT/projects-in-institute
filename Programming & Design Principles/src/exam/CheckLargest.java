package exam;
/*
Created by: Dany
Created on 30/01/2023 : 10:16
This is program to
*/

//import library
import java.util.Scanner;

public class CheckLargest {
    public static void main(String[] args) {
        //variable of Scanner
        Scanner scanner = new Scanner(System.in);

        //ask to enter first number
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        //ask to enter second number
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        //check what is larger
        //if firs larger
        if (num1 > num2) {
            System.out.println(num1 + " is larger");
        }
        //if second larger
        else if (num2 > num1) {
            System.out.println(num2 + " is larger");
        }
        //if equal
        else {
            System.out.println("These numbers are equal");
        }
    }//main
}//class
