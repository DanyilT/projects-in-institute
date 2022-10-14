package Lab_2;
/*
Created by: Dany
Created on  : 15:55
This is program to
*/

import java.util.Scanner;

public class MathematicalExpressions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a radius : ");
        double radius = scanner.nextDouble();
        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of circle = " + areaOfCircle);
    }
}
