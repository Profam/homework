package by.rabtsevich.task25.bankcard;

/*
Предназначены для выполнения операций за счет средств, представленных кредитором.
 */

import by.rabtsevich.task25.bankcard.BankCard;

public class CreditCard extends BankCard implements Payable {
    private int balance;
    private int maxCreditValue = 1000;
    private int pin;

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        if (pin > 999)
            this.pin = pin;
        else System.out.println("Ошибка! Введите 4-х значное неотрицательное значение!");
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance >= 0)
            this.balance = balance;
        else System.out.println("Ошибка! Баланс не может быть отрицательным!");
    }

    public CreditCard(String bankAccount, String uniqueCardNumber) {
        this.bankAccount = bankAccount;
        this.uniqueCardNumber = uniqueCardNumber;
        ;
    }

    @Override
    public void pay(int money) {
        if (money <= 0)
            System.out.println("Ошибка! Введите положительное значение!");
        else if ((Math.abs(this.balance) + money) > maxCreditValue )
            System.out.println("Ошибка! Превышен лимит кредитных средств!");
        else this.balance -= money;
    }

    @Override
    public void deposit(int money) {
        if (money >= 0)
            this.balance += money;
        else System.out.println("Ошибка! Введите положительное значение!");

    }
}
