package lab_3;
/*
Created by: Dany
Created on 15/10/2022 : 10:31
This is program to
*/

import java.util.Scanner;

public class HolidayCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people;
        double cost;
        double vat;

        System.out.print("How many people? -- ");
        people = scanner.nextInt();
        boolean personORpeople = people == 1 ? true : false;

        System.out.print("How much does it cost? -- ");
        cost = scanner.nextDouble();

        vat = cost * 0.2;

        System.out.println("_________________________________________________________\n\t" +
                people + (personORpeople ? " -- person" : " -- people\n\t") +
                cost + " -- total cost for one person\n\t" +
                (cost-vat) + " -- total cost for one person(including VAT)\n\t" +
                cost*people + " -- total overall cost(including VAT)");
    }
}
