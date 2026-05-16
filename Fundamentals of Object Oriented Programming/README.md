# Fundamentals of Object Oriented Programming

This folder contains Java OOP projects and assignments demonstrating key object-oriented programming concepts.

## Projects

- [**animal**](#animal): Demonstrates inheritance and polymorphism with animal classes
- [**bankAccountApp**](#bankaccountapp): Simulates bank accounts with savings/checking, CSV import, and interest calculation
- [**emailApp**](#emailapp): Email account setup and HR information management
- [**exam**](#exam): OOP exercises and exam's project

### animal

- [animal](src/animal) - Demonstrates inheritance and polymorphism with animal classes.

Demonstrates inheritance and polymorphism through an animal hierarchy:
- Base [`Animal`](src/animal/Animal.java) class with food and life expectancy properties
- [`Lion`](src/animal/Lion.java) subclass extending Animal with age and name
- Multiple constructor overloading examples
- toString method implementation
- Interactive console application ([Main.java](src/animal/Main.java))

**Files:**
- [Main.java](src/animal/Main.java) - Interactive demo application
- [Animal.java](src/animal/Animal.java) - Base animal class
- [Lion.java](src/animal/Lion.java) - Lion subclass with multiple constructors

### bankAccountApp

- [bankAccountApp](src/bankAccountApp) - Simulates bank accounts with savings/checking, CSV import, and interest calculation.

A comprehensive banking system simulation featuring:
- Abstract [`Account`](src/bankAccountApp/main/Account.java) class with common banking operations
- [`Checking`](src/bankAccountApp/main/Checking.java) account with debit card features
- [`Saving`](src/bankAccountApp/main/Saving.java) account with safety deposit box
- CSV file import functionality ([CSV.java](src/bankAccountApp/utilities/CSV.java))
- Interest rate calculations using [`IBaseRate`](src/bankAccountApp/main/IBaseRate.java) interface
- Account number generation with unique identifiers

**Files:**
- [BankAccountApp.java](src/bankAccountApp/main/BankAccountApp.java) - Main application
- [Account.java](src/bankAccountApp/main/Account.java) - Abstract base account class
- [Checking.java](src/bankAccountApp/main/Checking.java) - Checking account implementation
- [Saving.java](src/bankAccountApp/main/Saving.java) - Savings account implementation
- [IBaseRate.java](src/bankAccountApp/main/IBaseRate.java) - Interest rate interface
- [CSV.java](src/bankAccountApp/utilities/CSV.java) - CSV file reader utility
- [NewBankAccounts.csv](src/bankAccountApp/utilities/NewBankAccounts.csv) - Sample account data

**Resources:**
- [Chart img](chart/bankAccountApp/Banking%20App%20Lucidchart%20(transparent).png)
- [Chart (lucidchart link)](https://lucid.app/lucidchart/86d32583-d06f-47bc-ba32-e95be6cb2c59/edit?invitationId=inv_72ce66b9-0f85-4098-ad13-7829053e53af)

### emailApp

- [emailApp](src/emailApp) - Email account setup and HR information management.

Email and HR information management system:
- [`Email`](src/emailApp/Email.java) class for email account setup
- [`HR_Department`](src/emailApp/HR_Department.java) class for employee information
- Automatic email generation from name and department
- Random password generation with option to customize
- Phone number and salary management

**Files:**
- [Main.java](src/emailApp/Main.java) - Application entry point with menu system
- [Email.java](src/emailApp/Email.java) - Email account management
- [HR_Department.java](src/emailApp/HR_Department.java) - HR information management

**Resources:**
- [Chart img](chart/emailApp/Email%20Lucidchart%20(transparent).png)
- [Chart (lucidchart link)](https://lucid.app/lucidchart/fc1e354e-5cad-42d5-aebb-da7536a6c585/edit?invitationId=inv_c6893560-2e0f-408e-ac2f-8ff3652393c3)

### exam

- [exam](src/exam) - OOP exercises and exam's project.

OOP exam exercises demonstrating various concepts:
- [VotingAgeChecker.java](src/exam/VotingAgeChecker.java) - Validates voting eligibility with error handling
- [Main.java](src/exam/Main.java) - Basic variable declarations and operations
- Pizza ordering system with inheritance:
  - [`Food`](src/exam/pizza/Food.java) - Base food class with name and calories
  - [`Pizza`](src/exam/pizza/Pizza.java) - Pizza subclass with toppings array
  - [`Main`](src/exam/pizza/Main.java) - Demo creating different pizza types

**Files:**
- [VotingAgeChecker.java](src/exam/VotingAgeChecker.java)
- [Main.java](src/exam/Main.java)
- [Food.java](src/exam/pizza/Food.java)
- [Pizza.java](src/exam/pizza/Pizza.java)
- [Main.java](src/exam/pizza/Main.java)
