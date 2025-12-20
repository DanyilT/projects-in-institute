package bankAccountApp.main;
/*
Created by: Dany
Created on 03/03/2023 : 14:13
Sub class
*/

public class Checking extends Account {
    // List properties specific to the Checking account
    private int cardNumber;
    private int cardPIN;

    // Constructors to initialise Checking account properties
    public Checking(String name, String ppsNumber, double initDeposit) {
        super(name, ppsNumber, initDeposit);
        accountNumber = '2' + accountNumber;

        // Call the method for debit card number
        setDebitCardNumber();
    }

    // List any methods specific to the Checking account
    @Override
    public void setRate() {
        rate = getBaseRate() * 0.15;
    }

    private void setDebitCardNumber() {
        // Debit card number is a 12 digit number - random
        cardNumber = (int) (Math.random() * Math.pow(10, 12));
        cardPIN = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.format("ACCOUNT TYPE: Checking\n" +
                        "Your Checking account Features\n" +
                        "Debit Card Number: %s\n" +
                        "Debit Card's PIN: %s\n",
                cardNumber, cardPIN);
    }
}
