package by.rabtsevich.task17;

/*
Задание 17.
Создать двухмерный квадратный массив, и заполнить его "бабочкой",
т.е таким образом:
1 1 1 1 1
0 1 1 1 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1
 */
public class Butterfly {

    public static void main(String[] args) {
        int[][] array = new int[10][10];

        for (int i = 0; i < array.length/2 + 1; i++) {//от начала массива к середине
            for (int j = 0; j<array[i].length; j++) {
                if(i>j || j >= array[i].length - i)
                array[i][j] = 0;
                else array[i][j] = 1;
            }
        }

        for (int i = array.length-1; i >= array.length/2; i--) {//от конца массива к середине
            for (int j = 0; j<array[i].length; j++) {
                if(i<j || j < array[i].length - 1 - i)
                    array[i][j] = 0;
                else array[i][j] = 1;
            }

        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j<array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
