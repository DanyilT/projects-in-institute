package emailApp;
/*
Created by: Dany
Created on 18/11/2022 : 14:02
This is program to
*/

public class HR_Department extends Email {

//create properties for HR
    private double salary;
    private int numHours;

//constructor
    public HR_Department() {} ///default constructor

    public HR_Department(double salary, int numHours) {
        this.salary = salary;
        this.numHours = numHours;
    } //alternative constructor
    public HR_Department(String firstName, String lastName, double salary, int numHours) {
        super(firstName, lastName);
        this.salary = salary;
        this.numHours = numHours;
    } //alternative constructor

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNumHours() {
        return numHours;
    }

    public void setNumHours(int numHours) {
        this.numHours = numHours;
    }

    public void printInfo (){
        System.out.println("\n\t STAFF INFO");
        System.out.println("_____________________");
        System.out.println(" Salary : " + salary + "\n Number of hours : " + numHours);
    }
}
