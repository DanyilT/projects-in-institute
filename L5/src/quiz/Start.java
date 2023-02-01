package quiz;
/*
Created by: Dany
Created on 23/01/2023 : 10:18
This is program to
*/

import java.util.Scanner;
import java.util.HashMap;

public class Start {
//variables
    private static String username;
    private static String password;
    private static HashMap<String, String> users = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

//says hello
    public static void hello() {
        System.out.println( "\n<————————————————————————————————————————————————————————————————————————————————————>" +
                            "\n| D DD                  A             N        N      Y         Y                    |" +
                            "\n| D     D              A A            N N      N       Y       Y                     |" +
                            "\n| D      D            A   A           N  N     N        Y     Y                      |" +
                            "\n| D       D          A     A          N   N    N         Y   Y                       |" +
                            "\n| D       D         A AAAAA A         N    N   N           Y            I            |" +
                            "\n| D      D         A         A        N     N  N           Y            I  n n    cc |" +
                            "\n| D     D         A           A       N      N N           Y            I  n  n  c   |" +
                            "\n| D DD           A             A      N        N           Y        o   I  n  n   cc |" +
                            "\n<————————————————————————————————————————————————————————————————————————————————————>\n");

        int n = 25;
        String descr;
        descr ="welcome to my game";
        System.out.printf("|%"+(n-(descr.length()/2))+"s|" + descr.toUpperCase() + "|%"+(n-(descr.length()/2))+"s|\n", "", "");
        descr ="Instruction";
        System.out.printf("|%"+(n-(descr.length()/2))+"s\b|" + descr + "|%"+(n-(descr.length()/2))+"s|\n", "", "");
        System.out.printf("%cI will ask you questions, and your task is to answer\n" +
                "\tthem correctly.\n" +
                "%cYou will have one attempt to answer one question.\n", '>', '>');
        descr ="GAME - ['Quiz']";
        System.out.printf("|%"+(n-(descr.length()/2))+"s\b|" + descr + "|%"+(n-(descr.length()/2))+"s|\n", "", "");
    }

//login/registration method
    public static String login() {
        int choice;
        while (true) {
            System.out.println("------------------------------------------------------");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            if (choice == 1) {
                System.out.print("Enter your username: ");
                username = scanner.nextLine();

                System.out.print("Enter your password: ");
                password = scanner.nextLine();

                users.put(username, password);
                System.out.println("Registration successful!\n");
            } else if (choice == 2) {
                System.out.print("Enter your username: ");
                username = scanner.nextLine();

                System.out.print("Enter your password: ");
                password = scanner.nextLine();

                if (users.containsKey(username) && users.get(username).equals(password)) {
                    System.out.println("Login successful!\n");
                    System.out.printf("Hello, %s 👋\n\n", username);
                    break;
                } else {
                    System.out.println("Invalid username or password\n");
                }
            } else if (choice == 3) {
                System.out.println("Ok, see you‍😶‍🌫");
                System.exit(0);
                break;
            } else {
                System.err.println("Invalid choice\n");
            }
        }
        return username;
    }
}
