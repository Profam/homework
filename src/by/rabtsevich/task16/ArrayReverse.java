package by.rabtsevich.task16;

/*
Задание 16.
Создать массив, заполнить его случайными элементами, распечатать, перевернуть,
и снова распечатать (при переворачивании нежелательно создавать еще один массив).
 */

public class ArrayReverse {

    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0; i<array.length; i++){
            array[i] = (int) (Math.random() * 100 + 1);
            System.out.print("[" + i + "]=" + array[i] + " ");
        }

        System.out.println();

        arrayReverse(array);

        for(int i = 0; i<array.length; i++){
            System.out.print("[" + i + "]=" + array[i] + " ");
        }
    }

    static int[] arrayReverse(int[] array) {
        for(int i = 0; i < array.length / 2; i++) {
            int a = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = a;
        }
        return array;
    }
}
