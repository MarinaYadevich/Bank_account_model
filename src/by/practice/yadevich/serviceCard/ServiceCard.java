package by.practice.yadevich.serviceCard;

import by.practice.yadevich.bankAccount.BankAccount;

public class ServiceCard {

    public static void deposit(BankAccount bankAccount, double amount) {
        if (amount <= 0) {
            System.out.println("Incorrect amount.");
        } else {
            bankAccount.setBalance(bankAccount.getBalance() + amount);
            System.out.println("The amount has been successfully deposited.");
        }
    }
    public static void withdraw(BankAccount bankAccount, double amount){
        if(amount <= 0) {
            System.out.println("Incorrect amount.");
        }else if(bankAccount.getBalance() < amount){
            System.out.println("Insufficient funds.");
        }else{
            bankAccount.setBalance(bankAccount.getBalance() - amount);
            System.out.println("Funds have been successfully withdrawn.");
        }
    }
    public static void getBalanceInfo(BankAccount bankAccount){
        System.out.println("Current balance: " + bankAccount.getBalance());
    }
    public static void displayAccountInfo(BankAccount bankAccount){
        System.out.println("Info account: \n"
                + "Account number: " + bankAccount.getAccountNumber() + "\n"
                + "Account holder: " + bankAccount.getAccountHolder() + "\n"
                + "Current balance: " + bankAccount.getBalance() + "\n");
    }
}
