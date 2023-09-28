package exam.pizza;
/*
Created by: Dany
Created on 31/03/2023 : 15:43
This is program to
*/

public class Main {
    public static void main(String[] args) {
        Pizza pepperoniPizza = new Pizza("Pepperoni Pizza", 1000, "Pepperoni", "Mushrooms", "Onions");
        Pizza hawaiianPizza = new Pizza("Hawaiian Pizza", 900, "Ham", "Pineapple", "Green Peppers");
        Food caesarSalad = new Food("Caesar Salad", 400);

        hawaiianPizza.showInfo();
        pepperoniPizza.showInfo();
        caesarSalad.showInfo();
    }
}
