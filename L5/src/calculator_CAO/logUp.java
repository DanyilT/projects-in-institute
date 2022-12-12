package calculator_CAO;
/*
Created by: Dany
Created on 05/12/2022 : 10:05
This is program to
*/

import java.util.Scanner;

public class logUp {
    static Scanner scanner = new Scanner(System.in);
    public static String username, password;
    public static void LogUp() {
        System.out.println("\t\t\tNEW USER LOGIN\n");
        System.out.println("||CREATE USERNAME");
        username = scanner.nextLine();
        System.out.println("CREATE PASSWORD");
        password = scanner.nextLine();
    }
}
