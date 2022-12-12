package calculator_CAO;
/*
Created by: Dany
Created on 12/12/2022 : 10:36
This is program to
*/

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    public static int maths, communications, workEx, physics, english, coding;
    private static final int PASS = 50;
    private static final int MERIT = 65;
    private static final int DISTINCTION = 80;
    private final static int PASS_CAO = 25;
    private final static int MERIT_CAO = 40;
    private final static int DIST_CAO = 50;

    private final static int maxCAO = 260;
    public static int studentTotal_CAO;

// MATHS
    public static int getMaths(int maths) {
        System.out.print("MATHS: ");
        maths = scanner.nextInt();

    // PASS CHECK
        if (maths >= PASS && maths < MERIT) {
            System.out.println("||PASS ACHIEVE: " + maths);
            System.out.println("||AWARDED " + PASS_CAO + " CAO POINTS");
            System.out.println("--------------------");
            return maths = PASS_CAO;
        }
    // MERIT CHECK
        else if (maths >= MERIT && maths < DISTINCTION) {
            System.out.println("||MERIT ACHIEVE: " + maths + " MARK");
            System.out.println("||AWARDED " + MERIT_CAO + " CAO POINTS");
            System.out.println("--------------------");
            return maths = MERIT_CAO;
        }
    // DISTINCTION CHECK
        else if (maths >= DISTINCTION && maths < 100) {
            System.out.println("||DISTINCTION ACHIEVE: " + maths + " MARK");
            System.out.println("||AWARDED " + DIST_CAO + " CAO POINTS");
            System.out.println("--------------------");
            return maths = DIST_CAO;
        } else {
            System.out.println("||MARK ACHIEVE: " + maths + " MARK");
            System.out.println("||AWARDED 0 CAO POINTS ");
            System.out.println("--------------------");
            System.out.println("--------------");
            System.out.println(" EXIT PROGRAM");
            System.out.println("--------------");
            System.exit(0);
            return maths;
        }
    }

// COMMUNICATION
    public static int getCommunications(int communications) {
        System.out.print("COMMUNICATION: ");
        communications = scanner.nextInt();

    // PASS CHECK
        if (communications >= PASS && communications < MERIT) {
            System.out.println("||PASS ACHIEVE: " + communications);
            System.out.println("||AWARDED " + PASS_CAO + " CAO POINTS");
            System.out.println("--------------------");
            return communications = PASS_CAO;
        }
    // MERIT CHECK
        else if (communications >= MERIT && communications < DISTINCTION) {
            System.out.println("||MERIT ACHIEVE: " + communications + " MARK");
            System.out.println("||AWARDED " + MERIT_CAO + " CAO POINTS");
            System.out.println("--------------------");
            return communications = MERIT_CAO;
        }
    // DISTINCTION CHECK
        else if (communications >= DISTINCTION && communications < 100) {
            System.out.println("||DISTINCTION ACHIEVE: " + communications + " MARK");
            System.out.println("||AWARDED " + DIST_CAO + " CAO POINTS");
            System.out.println("--------------------");
            return communications = DIST_CAO;
        } else {
            System.out.println("||MARK ACHIEVE: " + communications + " MARK");
            System.out.println("||AWARDED 0 CAO POINTS ");
            System.out.println("--------------------");
            System.out.println("--------------");
            System.out.println(" EXIT PROGRAM");
            System.out.println("--------------");
            System.exit(0);
            return communications;
        }
    }

// WORK EXPERIENCE
    public static int getWorkEx(int workEx) {
        System.out.print("WORK EXPERIENCE: ");
        workEx = scanner.nextInt();

    // PASS CHECK
        if (workEx >= PASS && workEx < MERIT) {
            System.out.println("||PASS ACHIEVE: " + workEx);
            System.out.println("||AWARDED " + PASS_CAO + " CAO POINTS");
            System.out.println("--------------------");
            return workEx = PASS_CAO;
        }
    // MERIT CHECK
        else if (workEx >= MERIT && workEx < DISTINCTION) {
            System.out.println("||MERIT ACHIEVE: " + workEx + " MARK");
            System.out.println("||AWARDED " + MERIT_CAO + " CAO POINTS");
            System.out.println("--------------------");
            return workEx = MERIT_CAO;
        }
    // DISTINCTION CHECK
        else if (workEx >= DISTINCTION && workEx < 100) {
            System.out.println("||DISTINCTION ACHIEVE: " + workEx + " MARK");
            System.out.println("||AWARDED " + DIST_CAO + " CAO POINTS");
            System.out.println("--------------------");
            return workEx = DIST_CAO;
        } else {
            System.out.println("||MARK ACHIEVE: " + workEx + " MARK");
            System.out.println("||AWARDED 0 CAO POINTS ");
            System.out.println("--------------------");
            System.out.println("--------------");
            System.out.println(" EXIT PROGRAM");
            System.out.println("--------------");
            System.exit(0);
            return workEx;
        }
    }

// PHYSICS
    public static int getPhysics(int physics) {
        System.out.print("PHYSICS: ");
        physics = scanner.nextInt();

    // PASS CHECK
        if (physics >= PASS && physics < MERIT) {
            System.out.println("||PASS ACHIEVE: " + physics);
            System.out.println("||AWARDED " + PASS_CAO + " CAO POINTS");
            System.out.println("--------------------");
            return physics = PASS_CAO;
        }
    // MERIT CHECK
        else if (physics >= MERIT && physics < DISTINCTION) {
            System.out.println("||MERIT ACHIEVE: " + physics + " MARK");
            System.out.println("||AWARDED " + MERIT_CAO + " CAO POINTS");
            System.out.println("--------------------");
            return physics = MERIT_CAO;
        }
    // DISTINCTION CHECK
        else if (physics >= DISTINCTION && physics < 100) {
            System.out.println("||DISTINCTION ACHIEVE: " + physics + " MARK");
            System.out.println("||AWARDED " + DIST_CAO + " CAO POINTS");
            System.out.println("--------------------");
            return physics = DIST_CAO;
        } else {
            System.out.println("||MARK ACHIEVE: " + physics + " MARK");
            System.out.println("||AWARDED 0 CAO POINTS ");
            System.out.println("--------------------");
            System.out.println("--------------");
            System.out.println(" EXIT PROGRAM");
            System.out.println("--------------");
            System.exit(0);
            return physics;
        }
    }

// ENGLISH
    public static int getEnglish(int english) {
        System.out.print("ENGLISH: ");
        english = scanner.nextInt();

    // PASS CHECK
        if (english >= PASS && english < MERIT) {
            System.out.println("||PASS ACHIEVE: " + english);
            System.out.println("||AWARDED " + PASS_CAO + " CAO POINTS");
            System.out.println("--------------------");
            return english = PASS_CAO;
        }
    // MERIT CHECK
        else if (english >= MERIT && english < DISTINCTION) {
            System.out.println("||MERIT ACHIEVE: " + english + " MARK");
            System.out.println("||AWARDED " + MERIT_CAO + " CAO POINTS");
            System.out.println("--------------------");
            return english = MERIT_CAO;
        }
    // DISTINCTION CHECK
        else if (english >= DISTINCTION && english < 100) {
            System.out.println("||DISTINCTION ACHIEVE: " + english + " MARK");
            System.out.println("||AWARDED " + DIST_CAO + " CAO POINTS");
            System.out.println("--------------------");
            return english = DIST_CAO;
        } else {
            System.out.println("||MARK ACHIEVE: " + english + " MARK");
            System.out.println("||AWARDED 0 CAO POINTS ");
            System.out.println("--------------------");
            System.out.println("--------------");
            System.out.println(" EXIT PROGRAM");
            System.out.println("--------------");
            System.exit(0);
            return english;
        }
    }

// CODING
    public static int getCoding(int coding) {
        System.out.print("CODING: ");
        coding = scanner.nextInt();

    // PASS CHECK
        if (coding >= PASS && coding < MERIT) {
            System.out.println("||PASS ACHIEVE: " + coding);
            System.out.println("||AWARDED " + PASS_CAO + " CAO POINTS");
            System.out.println("--------------------");
            return coding = PASS_CAO;
        }
    // MERIT CHECK
        else if (coding >= MERIT && coding < DISTINCTION) {
            System.out.println("||MERIT ACHIEVE: " + coding + " MARK");
            System.out.println("||AWARDED " + MERIT_CAO + " CAO POINTS");
            System.out.println("--------------------");
            return coding = MERIT_CAO;
        }
    // DISTINCTION CHECK
        else if (coding >= DISTINCTION && coding < 100) {
            System.out.println("||DISTINCTION ACHIEVE: " + coding + " MARK");
            System.out.println("||AWARDED " + DIST_CAO + " CAO POINTS");
            System.out.println("--------------------");
            return coding = DIST_CAO;
        } else {
            System.out.println("||MARK ACHIEVE: " + coding + " MARK");
            System.out.println("||AWARDED 0 CAO POINTS ");
            System.out.println("--------------------");
            System.out.println("--------------");
            System.out.println(" EXIT PROGRAM");
            System.out.println("--------------");
            System.exit(0);
            return coding;
        }
    }

// STUDENT TOTAL CAO
    public static int getStudentTotal_CAO(int studentTotal_CAO) {
        return studentTotal_CAO = getMaths(maths) + getCommunications(communications) + getWorkEx(workEx) + getPhysics(physics) + getEnglish(english) + getCoding(coding);
    }

// PRINT INFO
    public static void printInfo() {
        System.out.println("PLEASE ENTER COURSE MARKS");
        System.out.println("--------------------");
        int printInfo_getStudentTotal_CAO = getStudentTotal_CAO(studentTotal_CAO);
        System.out.println("INPUT COMPLETE");
        System.out.println("\n====================");
        System.out.println("\tRESULT");
        System.out.println("|| TOTAL CAO POINT = " + printInfo_getStudentTotal_CAO);

        boolean goCollege = printInfo_getStudentTotal_CAO >= 260;
        if (goCollege) {
            System.out.println(">> YOU QUALIFY ON CAO 🥳");
        } else {
            System.out.println(">> SORRY, BUT YOU DID NOT QUALIFY ON CAO 😔");
        }
    }
}
