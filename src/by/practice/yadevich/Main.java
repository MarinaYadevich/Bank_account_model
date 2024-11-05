package by.practice.yadevich;

import by.practice.yadevich.bankAccount.BankAccount;
import by.practice.yadevich.serviceCard.ServiceCard;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("3756475647", "Marina Yadevich", 5000);
        ServiceCard.deposit(bankAccount1, 1000);
        ServiceCard.withdraw(bankAccount1,100);
        ServiceCard.displayAccountInfo(bankAccount1);
        ServiceCard.getBalanceInfo(bankAccount1);
    }
}
