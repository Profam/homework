package by.rabtsevich.task24.household.smallhousehold;

import by.rabtsevich.task24.household.Pluggable;

public class DvdPlayer extends SmallHouseHold {
    final String houseHoldName = "DVD плеер";

    public DvdPlayer() {
    }

    public DvdPlayer(String tradeMark, double weight) {
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
    public void isMove() {
            if (weight == 0)
                System.out.println(houseHoldName + " не задан вес");
            if (weight <= maxWeight)
            System.out.println(houseHoldName + " легко переносится");
            else System.out.println("Unexpected error!");
    }
}
