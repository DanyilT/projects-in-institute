package Age;
/*
Created by: Dany
Created on 26/10/2022 : 13:15
This is program to
*/

public class DataType {
    private double age;
    private double time;

    public DataType(double age, double time) {
        this.age = age;
        this.time = time;
    }

    public double getAge() {
        return age;
    }
    public double getTime() {
        return time;
    }


    public void run() {
        System.out.println("Your age now is " + getAge() + "\nYour age after " + getTime() + " is " + getTime()*getAge());
    }
}
