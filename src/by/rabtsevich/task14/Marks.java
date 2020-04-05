package by.rabtsevich.task14;

/*
Задание 14.
В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер.
 */

public class Marks {

    public static void main(String[] args) {
        int[] marks = new int[10];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
            System.out.print("[" + i + "]=" + marks[i] + " ");
        }
        System.out.println();
        maxMark(marks);
    }

    static void maxMark(int[] marks) {
        int max = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (max < marks[i]) {
                max = marks[i];
            }
        }
        for (int i = 1; i < marks.length; i++) {
            if (max == marks[i]) {
                System.out.println("Порядковый номер максимального элемента: " + i);
            }
        }
        System.out.println("Максимальная оценка: " + max);
    }
}
