package OOPs.Mock;

/*
Created by: Dany
Created on  : 11:08
This program is
*/

import java.util.*;

public class DateTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Date myDate = new Date(9, 11, 1986);
        System.out.println("\nWHAT IS YOUR DATE OF BIRTH?\n");

        System.out.print("Please Enter The Month (1-12): ");

        int myMonth = input.nextInt();
        myDate.setMonthDate(myMonth);
        System.out.print("\nPlease Enter the Date: ");

        int myDay = input.nextInt();
        myDate.setDayDate(myDay);
        System.out.print("\nPlease Enter the Year: ");

        int myYear = input.nextInt();
        myDate.setYearDate(myYear);

        myDate.displayDate();
    }
}
