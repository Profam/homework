package by.rabtsevich.task25.main;

/*
Задание 25.
Создать иерархию классов, описывающих банковские карточки.
Иерархия должна иметь хотя бы три уровня.
 */

import by.rabtsevich.task25.bankcard.CreditCard;
import by.rabtsevich.task25.bankcard.DebitCard;

public class Main {

    public static void main(String[] args) {

        DebitCard card1 = new DebitCard("123", "234");
        card1.setBalance(200);
        System.out.println(card1.getBalance());
        card1.pay(100);
        System.out.println(card1.getBalance());
        card1.pay(100);
        System.out.println(card1.getBalance());
        card1.pay(1);
        System.out.println(card1.getBalance());
        card1.deposit(1);
        System.out.println(card1.getBalance());
        card1.deposit(-2);
        System.out.println(card1.getBalance());

        System.out.println();

        CreditCard card2 = new CreditCard("123", "234");
        card2.setBalance(200);
        System.out.println(card2.getBalance());
        card2.pay(100);
        System.out.println(card2.getBalance());
        card2.pay(100);
        System.out.println(card2.getBalance());
        card2.pay(1000);
        System.out.println(card2.getBalance());
        card2.deposit(1);
        System.out.println(card2.getBalance());
        card2.pay(2);
        System.out.println(card2.getBalance());

    }
}
