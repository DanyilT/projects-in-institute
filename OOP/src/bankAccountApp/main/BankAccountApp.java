package bankAccountApp.main;
/*
Created by: Dany
Created on 03/03/2023 : 14:16
Main Application
*/

import java.util.LinkedList;
import java.util.List;

import static bankAccountApp.utilities.CSV.read;

public class BankAccountApp {
    public static void main(String[] args) {
        // TO DO Auto-generate method sub

        // Read a CSV file

        // Test creating new account
        /*
        Checking checking1 = new Checking("Dany", "q12345", 99.9);

        Saving saving1 = new Saving("Test",  "t000", 0.01);

        checking1.showInfo();
        System.out.println("*********************************");
        saving1.showInfo();

        System.out.println("*********************************");
        saving1.deposit(100);
        saving1.withdraw(9);
        saving1.transfer("Myself", 0.00001);
        saving1.compound();
        */

        List<Account> accounts = new LinkedList<Account>();

        // Read a CSV file
        String file = "/Users/dany/Documents/GitHub/projects-in-bife/BankAccount/src/BankAccountApp/utilities/NewBankAccounts.csv";
        List<String[]> newAccountHolders = read(file);

        for (String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String ppsn = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            //System.out.println("\n\tACCOUNT");
            //System.out.printf("Name: %s\nPPS Number: %s\nAccount Type: %s\nBalance: %f$\n", name, ppsn, accountType, initDeposit);

            if (accountType.equalsIgnoreCase("Savings")) {
                //System.out.println("OPEN SAVING ACCOUNT");
                accounts.add(new Saving(name, ppsn, initDeposit));
            } else if (accountType.equalsIgnoreCase("Checking")) {
                //System.out.println("OPEN CHECKING ACCOUNT");
                accounts.add(new Checking(name, ppsn, initDeposit));
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }
        // Access an element in a data structure
        //accounts.get(5).showInfo();

        // Access elements in a data structure for all of them
        for (Account account : accounts) {
            account.showInfo();
            System.out.println("******************************");
        }
    }
}
