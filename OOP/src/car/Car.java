package car;
/*
Created by: Dany
Created on  : 15:40
This is program to
*/

public class Car {

    //Create properties
    private String make, colour;
    private int doorNum;
    private double price;

    //default constructor
    public Car() {}

    //alt constructor
    public Car(String make, String colour, int doorNum, double price) {
        this.make = make;
        this.colour =colour;
        this.doorNum = doorNum;
        this.price = price;
    }

    //getter
    public String getMake() {
        return this.make;
    }
    public String getColour() {
        return this.colour;
    }
    public int getDoorNum() {
        return this.doorNum;
    }
    public double getPrice() {
        return this.price;
    }

    //create method
    public void carInfo() {
        System.out.println("The make: " + make);
        System.out.println("The colour: " + colour);
        System.out.println("The doorNum: " + doorNum);
        System.out.println("The price: " + price);

    }
}
