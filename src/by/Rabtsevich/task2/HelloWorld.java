package by.Rabtsevich.task2;

/*
Задание 2
Продолжите пример, добавив расчет и вывод суток и недель.
 */
public class HelloWorld {

    public static void main(String[] args) {
        int s = 3700;
        int sec, m, min, h, d, day, w, week;
        sec = s % 60;
        m = (s - sec)/60;
        min = m % 60;
        h = (m - min)/60;
        day = h % 24;
        d = (h - day)/24;
        week = d % 7;
        w = (d-week)/7;
        System.out.println(w + " недель " + d + " суток " + h+" часов " + min + " минут " + sec + " секунд");
        System.out.println(sec);
    }
}
