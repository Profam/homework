package by.rabtsevich.task22;

/*
Задание 22.
Создать класс и объекты, описывающие промежуток времени.
Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов
(метод должен работать аналогично compareTo в строках). Создать два конструктора:
получающий общее количесвто секунд, и часы, минуты и секунды по отдельности.
Сделать метод для вывода данных. Прочее на ваше усмотрение.
 */

public class IntervalOfTime {

    private int  sec;
    private int min;
    private int hour;

    private int getTotalSec() {
        return hour*3600+min*60+sec;
    }

    private int compareTo(IntervalOfTime anotherInterval) {
        return Integer.compare(this.getTotalSec(), anotherInterval.getTotalSec());
    }

    private IntervalOfTime(int sec) {
        if (sec < 0)
            System.out.println("Ошибка ! Введите положительные значения промежутка времени!");
        else
        this.sec = sec;
    }

    private IntervalOfTime(int hour, int min, int sec) {
        if (hour < 0 || min < 0 || sec < 0)
            System.out.println("Ошибка ! Введите положительные значения промежутка времени!");
        else {
            this.hour = hour;
            this.min = min;
            this.sec = sec;
        }
    }

    public void print() {
        if(this.hour != 0 || this.min !=0)
            System.out.println("Промежуток времени равен " + this.hour + " час. " + this.min + " мин. " + this.sec + " сек.");
        else
        System.out.println("Промежуток времени равен " + this.getTotalSec() + " сек.");
    }

    public static void main(String[] args) {
        IntervalOfTime interval1 = new IntervalOfTime(-1,-1,-1);
        IntervalOfTime interval2 = new IntervalOfTime(-1);
        System.out.println(interval2.compareTo(interval1));
        interval1.print();
        interval2.print();

    }
}



