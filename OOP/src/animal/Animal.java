package animal;
/*
Created by: Dany
Created on  : 14:14
This is program to
*/

public class Animal {

    // create properties(attributes) of an animal
    private int lifeExpectancy;
    private String food;
    private boolean female = true;
    private int age;
    private double weight;
    private String name;

    //default constructor
    public Animal() {

    }
    public Animal(int lifeExpectancy, String food, boolean female, int age, double weight, String name) {
        this.lifeExpectancy = lifeExpectancy;
        this.food = food;
        this.female = female;
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    //this is a method
    public void speak() {
        System.out.println("My lifeExpectancy is " + lifeExpectancy);
        System.out.println("My food is " + food);
        System.out.println("My female is " + female);
        System.out.println("My age is " + age);
        System.out.println("My weight is " + weight);
        System.out.println("My name is " + name);
    }
}
