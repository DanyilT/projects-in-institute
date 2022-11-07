package lab_4;
/*
Created by: Dany
Created on 24/10/2022 : 10:12
This is program to
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tax1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        final double tax = 0.2;

        System.out.print("How many cost?: ");
        double cost = scanner.nextDouble();

        if (cost>=10000) {
            System.out.println(cost-(cost*tax));
        } else {
            System.out.println(cost);
        }
    }
}
