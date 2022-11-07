package lab_3;
/*
Created by: Dany
Created on 19/10/2022 : 13:09
This is program to
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Garden {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        double length, radius, area;

        System.out.print("Enter the length of the garden(in meters): ");
        length = keyboard.nextDouble();

        System.out.print("Enter the radius of the pond(in meters): ");
        radius = keyboard.nextDouble();

        area = Math.pow(length, 2) - (Math.PI * Math.pow(radius, 2));

        if(area<=0) {
            System.out.println("Its not real");
        } else {
            System.out.println("\nThe are of the lawn is " + decimalFormat.format(area) + " m squared");

        }

    }
}
