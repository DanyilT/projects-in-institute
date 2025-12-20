package quiz;
/*
Created by: Dany
Created on 25/01/2023 : 14:56
This is program to
*/

import java.util.Scanner;

public class Process {
//variables
    public static boolean cheatCode = false;
    private static String input;
    private static int num;
    private static Scanner scanner = new Scanner(System.in);

//start quiz
    public static int startOfGame() {
        System.out.println("\tWrite 'PLAY'");
        input = scanner.next();

//cheat-code
        if (input.toLowerCase().contains("qwerty")) {
            System.err.println("Ok, cheat-code: ON 👾");
            cheatCode = true;
            System.out.println("\tWrite 'PLAY'");
            input = scanner.nextLine();
        }

//launch the game
        while (!(input.equalsIgnoreCase("exit")) ||
                !(input.equalsIgnoreCase("yes")) ||
                !(input.equalsIgnoreCase("play")) ||
                !(input.equalsIgnoreCase("start"))) {
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Ok, see you‍😶‍🌫");
                System.exit(0);
            } else if ((input.equalsIgnoreCase("yes")) ||
                    (input.equalsIgnoreCase("play")) ||
                    (input.equalsIgnoreCase("start"))) {
                System.out.println("\tLets start 😎");
                System.out.print("How many questions do you want? //max 10\n\t");
                num = scanner.nextInt();

                for (int i = 0; i < 3; i++) {
                    if (num > 10) {
                        System.out.println("So many questions. Try again 😔");
                        num = scanner.nextInt();
                    }
                }
                if (num > 10) {
                    System.out.println("Try later, see you‍😶‍🌫");
                    System.exit(0);
                }
                System.out.println("Okay 😀");
                break;
            } else {
                System.err.println("I do not understand, write 'PLAY' or 'EXIT' 😔");
                input = scanner.next();
            }
        }
        return num;
    }
}
