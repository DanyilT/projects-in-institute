package emailApp;
/*
Created by: Dany
Created on 18/11/2022 : 14:01
This is program to test if email is working and to launch app. Create objects
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER YOUR NAME, please!!");
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();

        Email email0 = new Email();
        Email email = new Email(firstName, lastName);

        HR_Department hr_department0 = new HR_Department();
        HR_Department hr_department = new HR_Department(firstName, lastName, 99999, 1);

    }
}
