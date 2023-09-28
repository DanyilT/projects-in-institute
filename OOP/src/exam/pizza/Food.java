package exam.pizza;
/*
Created by: Dany
Created on 31/03/2023 : 15:10
This is program to
*/

public class Food {
    private String name;
    private int calories;

    // Constructor
    public Food(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    // Show Info
    public void showInfo() {
        System.out.printf("\nName: %s\nCalories: %d\n", getName(), getCalories());
    }
}
