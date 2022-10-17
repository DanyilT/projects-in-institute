package lab_3;
/*
Created by: Dany
Created on 15/10/2022 : 19:07
This is program to
*/

import javax.swing.*;
import java.util.Scanner;

public class AdditionTutor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num1 and num2:");
        final int NUMBER1 = scanner.nextInt(), NUMBER2 = scanner.nextInt();
        int answer;
        String answerString;

        answerString = JOptionPane.showInputDialog("What is " +
                NUMBER1  + " + " + NUMBER2 + "?");

        answer = Integer.parseInt(answerString);

        JOptionPane.showMessageDialog(null, NUMBER1 + " + " +
                NUMBER2  + " = " + answer + " is " +
                ((NUMBER1 + NUMBER2) == answer));

    }
}
