package exam;

import java.util.Scanner;

public class VotingAgeChecker {
    public static void main(String[] args) {
        // create scanner object for user input
        Scanner input = new Scanner(System.in);

        // prompt user to enter name and age
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age;

        // validate age input
        while (true) {
            try {
                age = Integer.parseInt(input.nextLine());
                if (age < 0) {
                    System.out.println("Invalid age. Please enter a positive integer.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid age. Please enter a valid integer.");
            }
        }

        // check if user is old enough to vote
        boolean isOldEnough = isOldEnoughToVote(age);

        // print result to console
        if (isOldEnough) {
            System.out.println(name + ", you are eligible to vote!");
        } else {
            System.out.println(name + ", you are not yet old enough to vote.");
        }
    }

    public static boolean isOldEnoughToVote(int age) {
        return age >= 18;
    }
}
