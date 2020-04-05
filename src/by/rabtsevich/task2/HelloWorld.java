package by.rabtsevich.task2;

/*
Задание 2
Продолжите пример, добавив расчет и вывод суток и недель.
 */
public class HelloWorld {

    public static void main(String[] args) {
        int s = 60*60*24*7*55;
        int sec, m, min, h, hour, d, day, week;
        sec = s % 60;
        m = (s - sec)/60;
        min = m % 60;
        h = (m - min)/60;
        hour = h % 24;
        d = (h - hour)/24;
        day = d % 7;
        week = (d-day)/7;
        System.out.println(week + " недель " + day + " суток " + hour +" часов " + min + " минут " + sec + " секунд");
    }
}
