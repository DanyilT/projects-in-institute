package lab_3;
/*
Created by: Dany
Created on 15/10/2022 : 10:33
This is program to
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class HolidayCost2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        //set the VAT rate
        final double VATRATE = 0.20;

        //declare variable for the number of people travelling
        int noOfPeople;

        //declare variables for flight and transfer costs
        double flightCost, transferCost;

        //declare the variables for the totals
        double flightTotal, transferTotal, total;


        //Enter the number of people travelling
        System.out.print("How many people are travelling? ");
        noOfPeople = keyboard.nextInt();

        //Enter the costs
        System.out.print("\nEnter the cost of each flight: £ ");
        flightCost = keyboard.nextDouble();
        System.out.print("Enter the cost of each transfer: £ ");
        transferCost = keyboard.nextDouble();


        //Calculate the totals
        flightTotal = noOfPeople * (flightCost * (1 + VATRATE));
        transferTotal = noOfPeople * (transferCost * (1 + VATRATE));
        total = flightTotal + transferTotal;

        //Output the result of the calculations
        System.out.println("\nTotal Cost for flights:\t\t\t£" +
                df.format(flightTotal));
        System.out.println("Total Cost for transfers:\t\t£" +
                df.format(transferTotal));
        System.out.println("\nTotal Cost \t\t\t\t\t\t£" +
                df.format(total));

    }
}
