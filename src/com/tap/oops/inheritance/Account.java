package com.tap.oops.inheritance;
import java.util.Scanner;

//Base class
class Account1 {
 private int accountNumber;
 private int balance;

 // Getters and Setters
 public int getAccountNumber() {
     return accountNumber;
 }

 public void setAccountNumber(int accountNumber) {
     this.accountNumber = accountNumber;
 }

 public int getBalance() {
     return balance;
 }

 public void setBalance(int balance) {
     this.balance = balance;
 }

 // Method
 public String getDetails() {
     return "Account Details: Account Number: " + accountNumber + ", Balance: " + balance;
 }
}

//SavingsAccount class
class SavingsAccount extends Account1 {
 private double interestRate;

 public double getInterestRate() {
     return interestRate;
 }

 public void setInterestRate(double interestRate) {
     this.interestRate = interestRate;
 }

 @Override
 public String getDetails() {
     return "Account Details: Account Number: " + getAccountNumber() +
             ", Balance: " + getBalance() +
             ", Interest Rate: " + interestRate + "%";
 }
}

//CurrentAccount class
class CurrentAccount extends Account1 {
 private int overdraftLimit;

 public int getOverdraftLimit() {
     return overdraftLimit;
 }

 public void setOverdraftLimit(int overdraftLimit) {
     this.overdraftLimit = overdraftLimit;
 }

 @Override
 public String getDetails() {
     return "Account Details: Account Number: " + getAccountNumber() +
             ", Balance: " + getBalance() +
             ", Overdraft Limit: " + overdraftLimit;
 }
}

//Main class
public class Account {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     String type = sc.nextLine();
     String input = sc.nextLine();

     String[] data = input.split(",");

     if (type.equals("SavingsAccount")) {
         SavingsAccount sa = new SavingsAccount();
         sa.setAccountNumber(Integer.parseInt(data[0]));
         sa.setBalance(Integer.parseInt(data[1]));
         sa.setInterestRate(Double.parseDouble(data[2]));

         System.out.println(sa.getDetails());

     } else if (type.equals("CurrentAccount")) {
         CurrentAccount ca = new CurrentAccount();
         ca.setAccountNumber(Integer.parseInt(data[0]));
         ca.setBalance(Integer.parseInt(data[1]));
         ca.setOverdraftLimit(Integer.parseInt(data[2]));

         System.out.println(ca.getDetails());
     }

     sc.close();
 }
}