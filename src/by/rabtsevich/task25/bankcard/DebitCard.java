package by.rabtsevich.task25.bankcard;

/*
Предназначены для оплаты товаровв или услуг, получения наличных денег.
 */

import by.rabtsevich.task25.bankcard.BankCard;

public class DebitCard extends BankCard implements Payable {

    private int balance;

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

    public DebitCard(String bankAccount, String uniqueCardNumber) {
        this.bankAccount = bankAccount;
        this.uniqueCardNumber = uniqueCardNumber;
    }

    @Override
    public void pay(int money) {
        if (money <= 0)
            System.out.println("Ошибка! Введите положительное значение!");
        else if (balance >= money )
            balance -= money;
        else System.out.println("Ошибка! На счете нет средств!");
    }

    public void deposit(int money) {
        if (money >= 0)
            this.balance += money;
        else System.out.println("Ошибка! Введите положительное значение!");
    }
}
