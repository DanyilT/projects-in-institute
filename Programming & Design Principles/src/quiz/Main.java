package quiz;
/*
Created by: Dany
Created on 11/01/2023 : 13:42
This is program to
*/

import java.util.Scanner;

import static quiz.Process.*;
import static quiz.Questioner.*;

public class Main extends Start {
//variables
    private static String input;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//hello method
        hello();
//login/registration method
        //login();
//start
        //startOfGame();
        questioner(login(), startOfGame(), cheatCode);
//again?
        while (true) {
            System.out.println("Do you want play again? //write your answer\n\t'again/yes/play/start' or 'exit'");
            input = scanner.next();

            if (input.toLowerCase().contains("exit")) {
                System.out.println("Ok, see you‍😶‍🌫");
                System.exit(0);
            } else if ((input.equalsIgnoreCase("again")) ||
                    (input.equalsIgnoreCase("yes")) ||
                    (input.equalsIgnoreCase("play")) ||
                    (input.equalsIgnoreCase("start"))) {
                questioner(login(), startOfGame(), cheatCode);
            } else {
                System.err.println("I do not understand, write 'PLAY' or 'EXIT' 😔");
            }
        }
    }
}
