package quiz;
/*
Created by: Dany
Created on 11/01/2023 : 14:05
This is program to
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Questioner extends DATA {
//variables
    private static ArrayList<Integer> used = new ArrayList<Integer>();
    private static int score = 0;
    private static int numberOfExample;
    private static String example;
    private static String answer;
    private static Scanner scanner = new Scanner(System.in);

    public static void questioner(String username, int totalExamples, boolean cheatCode) {
        for (int i = 0; i < totalExamples; i++) {
//generate random question's number
            numberOfExample = (int) (Math.random()*10)+0;
//check it if this question was used, if true => generate new random question's number
            while (used.contains(numberOfExample)) {
                numberOfExample = (int) (Math.random()*10)+0;
            }
            used.add(numberOfExample);

            example = examples(numberOfExample, i, false);
            answer = answers.get(i);

            System.out.format("-%53s\n", "-");
            int indent = 45;
            if (example.length() >= 45) {
                while (example.charAt(indent) != ' ') {
                    indent--;
                }
                System.out.format("|%d|-> |%s%" + (46 - example.substring(0, indent).length()) + "s|\n\t%s\n\t\t"
                        , i + 1, example.substring(0, indent), " ", example.substring(indent));
            } else {
                System.out.format("|%d|-> |%s%" + (46 - example.length()) + "s|\n\t\t", i+1, example, " ");
            }

            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(answer)) {
                System.out.println("\t\t\t\t\t>>>Correct!<<<");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + answer + ".");
            }
        }
        if (cheatCode) {
            score = totalExamples;
        }
        System.out.format("------------------------------------------------------" +
                "\n\t%s\tScore -> %d", username, score);
        System.out.println("\n______________________________________________________");

        score = 0;
        used.clear();
        examples(0,0,true);
    }
}
