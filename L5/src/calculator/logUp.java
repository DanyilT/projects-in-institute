package calculator;
/*
Created by: Dany
Created on 05/12/2022 : 10:05
This is program to
*/

import java.util.Scanner;

public class logUp extends logIn{
    public static String username;
    public static String password;
    public static void LogUp() {
        Scanner scanner = new Scanner(System.in);
// 3.Prompt for username
        System.out.println("\t\t\tNEW USER LOGIN\n");

        System.out.println("||CREATE USERNAME");
        username = scanner.nextLine();
        System.out.println("CREATE PASSWORD");
        password = scanner.nextLine();
    }
}
