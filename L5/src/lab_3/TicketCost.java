package lab_3;
/*
Created by: Dany
Created on 15/10/2022 : 11:39
This is program to
*/

import java.util.Scanner;

public class TicketCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double childTicket = 14.95;
        double adultTicket = 24.95;

        System.out.print("How many adult? -- ");
        int adults = scanner.nextInt();
        boolean adult = adults == 1 ? true : false;
        boolean adultZero = adults == 0 ? true :false;

        System.out.print("How many children? -- ");
        int children = scanner.nextInt();
        boolean child = children == 1 ? true : false;
        boolean childZero = children == 0 ? true : false;

        boolean error = (adults < 0 || children < 0) ? true : false;

        System.out.println("_________________________________________\n\t" +
                (error ? "ERROR" : (
                        (adultZero ? "" :
                            (adultTicket*adults + (adult ? " -- cost for adult\n\t" : " -- cost for adults\n\t"))) +
                        (childZero ? "" :
                            (childTicket*children + (child ? " -- cost for child\n\t" : " -- cost for children\n\t"))) +
                        ((adultZero && childZero) ? "null" :
                            (childTicket*children + adultTicket*adults + " -- total overall cost")))));
    }
}
