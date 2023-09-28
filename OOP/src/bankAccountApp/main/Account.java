package bankAccountApp.main;
/*
Created by: Dany
Created on 03/03/2023 : 14:14
Account is the super and parent class
*/

public abstract class Account implements IBaseRate {
    // List common properties for savings and checking
    private String name;
    private String ppsNumber;
    private double balance;
    protected String accountNumber;
    private static int index = 10000;
    protected double rate;

    // Constructor to set base properties to initialize the account
    public Account(String name, String ppsNumber, double initDeposit) {
        this.name = name;
        this.ppsNumber = ppsNumber;
        this.balance = initDeposit;
        // Set account number
        this.accountNumber = setAccountNumber();

        // Add property baseRate
        setRate();
    }

    // List common methods
    private String setAccountNumber() {
        String lastTwoOfPPS = ppsNumber.substring(ppsNumber.length()-2, ppsNumber.length());
        index++;
        int uniqueId = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfPPS + uniqueId + randomNumber;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.printf("\nDeposit: %f$", amount);
        printBalance();
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.printf("\nWithdraw: %f$", amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance += amount;
        System.out.printf("\nTransfer: %f$ | To: %s", amount, toWhere);
        printBalance();
    }

    public void printBalance() {
        System.out.printf("\nYour Balance is now: %f$", balance);
    }

    // Compound interest rate
    public void compound() {
        double accruedInterest = balance * (rate/100);
        balance += accruedInterest;
        System.out.printf("\nAccrued Interest: %f$", accruedInterest);
        printBalance();
    }

    // Created a method that will display all the information about the class
    public void showInfo() {
        System.out.println("\n\tACCOUNT");
        System.out.format("NAME: %s\nACCOUNT NUMBER: %s\nBALANCE: %s$\nRATE: %f%%\n",
                                name, accountNumber, balance, rate);
    }

    public abstract void setRate();
}
