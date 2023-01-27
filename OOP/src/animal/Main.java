package animal;
/*
Created by: Dany
Created on 27/01/2023 : 13:45
This is program to
*/
import java.util.Scanner;

public class Main {
    private static String food;
    private static int lifeExpectation;
    private static int age;
    private static String name;
    private static String input;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("My Lions:");
        Lion myLion = new Lion("meat", 10, 5, "Leo");
        System.out.println(myLion.toString());
        Lion myLion1 = new Lion("meat");
        System.out.println(myLion1.toString());
        Lion myLion2 = new Lion(10);
        System.out.println(myLion2.toString());
        Lion myLion3 = new Lion("meat", 5, "Leo");
        System.out.println(myLion3.toString());
        Lion myLion4 = new Lion(10, 5,"Leo");
        System.out.println(myLion4.toString());

        while (true) {
            System.out.println("\nWrite something to begin start //'exit' - for exit");
            input = scanner.next();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("Input name: ");
            name = scanner.next();
            System.out.println("Input food: ");
            food = scanner.next();
            System.out.println("Input lifeExpectation: ");
            lifeExpectation = scanner.nextInt();
            System.out.println("Input age: ");
            age = scanner.nextInt();

            Lion lion = new Lion(food, lifeExpectation, age, name);
            System.out.println(lion.toString());

            System.out.println("\n\nDo you want to re-run the program?");
        }
    }
}
