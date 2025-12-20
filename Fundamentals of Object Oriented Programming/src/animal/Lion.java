package animal;
/*
Created by: Dany
Created on 27/01/2023 : 14:08
This is program to
*/

class Lion extends Animal {
    private static int age;
    private static String name;

    // toString method
    public String toString() {
        return super.toString() + " Its name is " + name + " and it is " + age + " years old.";
    }

    // Default constructor
    public Lion() {
        super();
        this.age = 0;
        this.name = "unknown";
    }

    // Constructor for food, age, and name
    public Lion(String food, int age, String name) {
        super(food);
        this.age = age;
        this.name = name;
    }

    // Constructor for life expectancy, age, and name
    public Lion(int lifeExpectancy, int age, String name) {
        super(lifeExpectancy);
        this.age = age;
        this.name = name;
    }

    // Constructor for age, and name
    public Lion(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    // Constructor for age
    public Lion(int age) {
        super();
        this.age = age;
        this.name = "unknown";
    }

    // Constructor for name
    public Lion(String name) {
        super();
        this.age = 0;
        this.name = name;
    }

    // Constructor for food, life expectancy, age, and name
    public Lion(String food, int lifeExpectancy, int age, String name) {
        super(food, lifeExpectancy);
        this.age = age;
        this.name = name;
    }

    // Getters and Setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
