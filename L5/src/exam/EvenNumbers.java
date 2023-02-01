package exam;
/*
Created by: Dany
Created on 30/01/2023 : 11:04
This is program to
*/

public class EvenNumbers {
    public static void main(String[] args) {
        /*
        In this program, the 'for' loop is used
        to iterate over the numbers 2 to 100,
        incrementing 'i' by 2 each time.
        The 'println' statement is used
        to print each even number to the console.
        The '(i <= 100)' clause of the 'for' loop
        determines the range of numbers to be displayed,
        and the '(i += 2)' clause specifies that 'i' should be
        incremented by 2 after each iteration of the loop.
         */
        System.out.println("integers of digits are even numbers");
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }//main
}//class
