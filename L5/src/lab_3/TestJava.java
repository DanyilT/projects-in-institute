package lab_3;
/*
Created by: Dany
Created on 17/10/2022 : 12:52
This is program to
*/

public class TestJava {
    public static void main(String[] args) {
        char char1, char2, char3;
        int test;

        char1 = 'B';  //put letter 'A' into the first
        char2 = '&'; // put numeral '7' into second
        char3 = '-'; // put symbol '$' into third

        System.out.println("Letter : " + char1);
        System.out.println("Numeral : " + char2);
        System.out.println("Symbol : " + char3);

        // Casting Explored
        System.out.println("Letter : " + (int)char1);
        System.out.println("Numeral : " + (int)char2);
        System.out.println("Symbol : " + (int)char3);

        // using the char to add number value

        test = (int)char3 + (int)char2 +(int)char1;
        System.out.println(" B + & + - =" +test);

    }//main
}
