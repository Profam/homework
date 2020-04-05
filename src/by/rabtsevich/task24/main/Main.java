package by.rabtsevich.task24.main;

/*
Задание 24.
Создать иерархию классов, описывающих бытовую технику.
Создать несколько объектов описанных классов, часть из них включить в розетку.
Иерархия должна иметь хотя бы три уровня.
 */

import by.rabtsevich.task24.household.largehousehold.Refregerator;
import by.rabtsevich.task24.household.largehousehold.WashingMashine;
import by.rabtsevich.task24.household.smallhousehold.DvdPlayer;
import by.rabtsevich.task24.household.smallhousehold.Tv;

public class Main  {

    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.isPlug();
        tv.plugIn();
        tv.isPlug();
        tv.unplug();
        tv.isPlug();
        System.out.println();
        DvdPlayer dvdPlayer = new DvdPlayer("LG", 2);
        dvdPlayer.isMove(); //автономное устройство
        System.out.println();
        Refregerator refregerator = new Refregerator("Атлант",40.0);
        refregerator.isPlug();
        refregerator.plugIn();
        refregerator.isPlug();
        refregerator.unplug();
        refregerator.isPlug();
        System.out.println();
        WashingMashine washingMashine = new WashingMashine("Индезит", 105);
        washingMashine.isPlug();
    }
}
