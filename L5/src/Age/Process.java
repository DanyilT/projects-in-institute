package Age;/*
Created by: Dany
Created on 26/10/2022 : 13:14
This is program to
*/

import java.util.Scanner;

public class Process {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = scanner.nextDouble();
        double time = scanner.nextDouble();

        DataType dataType = new DataType(age, time);

        dataType.run();
    }
}
