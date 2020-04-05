package by.rabtsevich.task24.household.smallhousehold;

import by.rabtsevich.task24.household.Pluggable;

public class Tv extends SmallHouseHold implements Pluggable {
    final String houseHoldName = "Телевизор";
    protected boolean isPlug;

    public Tv() {
    }

    public Tv(String tradeMark, double weight) {
        this.tradeMark = tradeMark;
        if (weight < 0) {
            System.out.println("Ошибка! Введите положительное значение!");
            System.out.close();
        } else if (weight <= maxWeight)
            this.weight = weight;
        else {
            System.out.println("Ошибка! Введите вес меньше чем " + maxWeight);
            System.out.close();
        }
    }

    @Override
    public void plugIn() {
        isPlug = true;
    }

    @Override
    public void unplug() {
        isPlug = false;
    }

    @Override
    public void isPlug() {
        if (isPlug) {
            if (tradeMark == null)
                System.out.println(houseHoldName + " включен в розетку");
            else System.out.println(houseHoldName + " " + tradeMark + " включен в розетку");
        } else if (tradeMark == null)
                System.out.println(houseHoldName + " выключен из розетки");
                else System.out.println(houseHoldName + " " + tradeMark + " выключен из розетки");
    }

    @Override
    public void isMove() {
        if (weight == 0)
            System.out.println(houseHoldName + " не задан вес");
        if (weight <= maxWeight)
            System.out.println(houseHoldName + " легко переносится");
        else System.out.println("Unexpected error!");
    }
}