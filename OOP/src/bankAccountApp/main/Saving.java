package bankAccountApp.main;
/*
Created by: Dany
Created on 03/03/2023 : 14:14
Sub class
*/

public class Saving extends Account {
    // List properties specific to the Saving account
    private int safetyDepositBoxId;
    private int safetyDepositBoxKey;

    // Constructors to initialise Saving account properties
    public Saving(String name, String ppsNumber, double initDeposit) {
        super(name, ppsNumber, initDeposit);
        accountNumber = '1' + accountNumber;

        // Call the method for safety deposit box
        setSafetyDepositBox();
    }

    // List any methods specific to the Saving account
    @Override
    public void setRate() {
        rate = getBaseRate() - 0.15;
    }

    private void setSafetyDepositBox() {
        // Safety deposit box ID is a three digit number - random
        safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.format("ACCOUNT TYPE: Saving\n" +
                        "Your Savings account Features\n" +
                        "Safety Deposit Box ID: %s\n" +
                        "Safety Deposit Box Key: %s\n",
                safetyDepositBoxId, safetyDepositBoxKey);
    }
}
