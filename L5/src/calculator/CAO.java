package calculator;
/*
Created by: Dany
Created on 02/12/2022 : 13:47
This is program to CAO calculator
*/

import java.util.ArrayList;
import java.util.Scanner;

public class CAO extends logUp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//To Do
// 1.Create variables needed
// all subjects to be declared
//Variable subjects
        int maths, communications, workEx;

        // userName Pass
        String userName;
        String password;

//Final variables for P/M/D
        final int PASS = 50;
        final int MERIT = 65;
        final int DISTINCTION = 80;

//Final variable for point CAO
        final int PASS_CAO = 25;
        final int MERIT_CAO = 40;
        final int DIST_CAO = 50;

        final int maxCAO = 260;
        int studentTotal_CAO;

// 2.Prompt a welcome note
        System.out.println("\t\t WELCOME TO 2022 CAO");
        System.out.print("------------------------------------\n");

// 3.Prompt for username
        LogUp();
//Prompt the user to enter a username.
        LogIn();

// 4. Prompt clear instructions/ how to use
        System.out.println("\n\t\tINSTRUCTIONS");
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("--------------------");

//EXIT
        System.out.println("Enter 'EXIT' if you want finish it");
        String exit = scanner.nextLine();
        if (exit.toLowerCase().contains("exit")) {
            System.out.println("EXIT PROGRAM");
            System.out.println("--------------------");
            System.exit(0);
        }

// 5. Prompt user to input results
        System.out.println("PLEASE ENTER COURSE MARKS");
        System.out.println("--------------------");

//Maths marks
// Maths must be a pass  or if not the user must be informed
// (the program stopped and option to re-run or exit program)
        System.out.print("MATHS : ");
        maths = scanner.nextInt();
//  results need to be checked if PASSED and or if they are a Pass Merit or DIST award CAO Point to mark

// Communications marks
        System.out.print("COMMUNICATION : ");
        communications = scanner.nextInt();
// CHECK IF PASS AND AWARD POINT ( Pass Merit or DIST)
// PASS CHECK
        if (communications >= PASS && communications < MERIT) {
            System.out.println("||PASS ACHIEVE: " + communications);
            System.out.println("||AWARDED " + PASS_CAO + " CAO POINTS");
            communications = PASS_CAO;
            System.out.println("--------------------");
        }
// MERIT CHECK
        else if (communications >= MERIT && communications < DISTINCTION) {
            System.out.println("||MERIT ACHIEVE: " + communications + " MARK");
            System.out.println("||AWARDED " + MERIT_CAO + " CAO POINTS");
            System.out.println("--------------------");
            communications = MERIT_CAO;
        }
// DISTINCTION CHECK
        else if (communications >= DISTINCTION && communications < 100) {
            System.out.println("||DISTINCTION ACHIEVE: " + communications + " MARK");
            System.out.println("||AWARDED " + DIST_CAO + " CAO POINTS");
            System.out.println("--------------------");
            communications = DIST_CAO;
        } else {
            System.out.println("||MARK ACHIEVE: " + communications + " MARK");
            System.out.println("||AWARDED 0 CAO POINTS ");
            System.out.println("--------------------");
        }
// END communication

// WORK EXP marks
        System.out.print("WORK EXP : ");
        workEx = scanner.nextInt();
// CHECK IF PASS AND AWARD POINT ( Pass Merit or DIST)
// PASS CHECK
        if (workEx >= PASS && workEx < MERIT) {
            System.out.println("||PASS ACHIEVE: " + workEx);
            System.out.println("||AWARDED " + PASS_CAO + " CAO POINTS");
            workEx = PASS_CAO;
            System.out.println("--------------------");
        }
// MERIT CHECK
        else if (workEx >= MERIT && workEx < DISTINCTION) {
            System.out.println("||MERIT ACHIEVE: " + workEx + " MARK");
            System.out.println("||AWARDED " + MERIT_CAO + " CAO POINTS");
            workEx = MERIT_CAO;
            System.out.println("--------------------");
        }
// DISTINCTION CHECK
        else if (workEx >= DISTINCTION && workEx < 100) {
            System.out.println("||DISTINCTION ACHIEVE: " + workEx + " MARK");
            System.out.println("||AWARDED " + DIST_CAO + " CAO POINTS");
            workEx = DIST_CAO;
            System.out.println("--------------------");
        } else {
            System.out.println("||MARK ACHIEVE: " + workEx + " MARK");
            System.out.println("||AWARDED 0 CAO POINTS ");
            System.out.println("--------------------");
        }
// Award CAO Point to mark

// 7. Calculate overall CAO point - if statement to check if more than 250
        studentTotal_CAO = communications + workEx;

// Check if total_CAO is < or > 260 ( can be a final maxCAO_Point)

//8. Output a message user point and if they qualify for the CAO
        System.out.println("INPUT COMPLETE");
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("TOTAL CAO POINT = " + studentTotal_CAO);

        boolean goCollege = studentTotal_CAO >= 260;

// if marks more they 260  print  you  qualify on CAO
// else you did not qualify on CAO
        if (goCollege) {
            System.out.println("YOU QUALIFY ON CAO 🥳");
        } else {
            System.out.println("SORRY, BUT YOU DID NOT QUALIFY ON CAO 😔");
        }

        System.out.println("------------");
        System.out.println("EXIT PROGRAM");
        System.out.println("------------");
    }
}
