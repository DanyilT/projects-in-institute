package lab_2;
/*
Created by: Dany
Created on 15/10/2022 : 09:15
This is program to
*/

import java.util.Scanner;

public class Rectangle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare 4 variables to hold length, breadth, perimeter and area
        double length, breadth, perimeter, area;

        // Assign values to length and breadth
        System.out.print("Enter length : ");
        length = scanner.nextDouble();
        System.out.printf("Enter breadth : ");
        breadth = scanner.nextDouble();

        // Calculate, store the perimeter, area
        perimeter = 2 * (length + breadth);
        area = length * breadth;

        // Print out the perimeter, area
        System.out.println("________________________" + "\n\tPerimeter = " + perimeter + "\n\tArea = " + area);
    }
}
