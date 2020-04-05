package by.rabtsevich.task24.household.largehousehold;

import by.rabtsevich.task24.household.Pluggable;

public class WashingMashine extends LargeHouseHold implements Pluggable {
    final String houseHoldName = "Стиральная машина";
    protected boolean isPlug;

    public WashingMashine() {
    }

    public WashingMashine(String tradeMark, double weight) {
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
                System.out.println(houseHoldName + " включена в розетку");
            else System.out.println(houseHoldName + " " + tradeMark + " включена в розетку");
        } else if (tradeMark == null)
            System.out.println(houseHoldName + " выключена из розетки");
        else System.out.println(houseHoldName + " " + tradeMark + " выключена из розетки");
    }
}
