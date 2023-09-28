package exam.pizza;
/*
Created by: Dany
Created on 31/03/2023 : 15:09
This is program to
*/

import java.util.Arrays;

public class Pizza extends Food {
    private String[] toppings;

    // Constructor
    public Pizza(String name, int calories, String... toppings) {
        super(name, calories);
        this.toppings = toppings;
    }

    // Getter and Setter
    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }

    // Show Info
    public void showInfo() {
        super.showInfo();
        System.out.printf("Toppings: %s\n", Arrays.toString(getToppings()));
    }
}
