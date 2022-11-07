package lab_2;
/*
Created by: Dany
Created on 15/10/2022 : 11:41
This is program to
*/

import java.util.Scanner;

public class Me2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name, email, address;
        int phone, room;
        double high;

        System.out.print("Name : ");
        name = scanner.nextLine();

        System.out.print("Phone : ");
        phone = scanner.nextInt();

        System.out.print("Email : ");
        scanner.nextLine();
        email = scanner.nextLine();


        System.out.print("High : ");
        high = scanner.nextDouble();

        System.out.print("Room : ");
        room = scanner.nextInt();

        System.out.print("Address : ");
        scanner.nextLine();
        address = scanner.nextLine();

    }
}
