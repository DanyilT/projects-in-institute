package animal;
/*
Created by: Dany
Created on 27/01/2023 : 14:05
This is program to
*/

class Animal {
    private static String food;
    private static int lifeExpectancy;

    // toString method
    public String toString() {
        return "This " + food + "-eater has a life expectancy of " + lifeExpectancy + " years.";
    }

    // Default constructor
    public Animal() {
        this.food = "unknown";
        this.lifeExpectancy = 0;
    }

    // Constructor for food
    public Animal(String food) {
        this.food = food;
        this.lifeExpectancy = 0;
    }

    // Constructor for life expectancy
    public Animal(int lifeExpectancy) {
        this.food = "unknown";
        this.lifeExpectancy = lifeExpectancy;
    }

    // Constructor for both food and life expectancy
    public Animal(String food, int lifeExpectancy) {
        this.food = food;
        this.lifeExpectancy = lifeExpectancy;
    }

    // Getters and Setters
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(int lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }
}
