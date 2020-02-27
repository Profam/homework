package by.Rabtsevich.task15;

/*
Задание 15.
Определите сумму элементов массива, расположенных между минимальным
и максимальным значениями.
 */

public class ArrayElements {

    public static void main(String[] args) {
        int[] values = new int[10];
        for (int i = 0; i < values.length; i++) {
            values[i] = (int) (Math.random() * 100 + 1);
            System.out.print("[" + i + "]=" + values[i] + " ");
        }
        System.out.println();
        int minIndex = minIndex(values);
        int maxIndex = maxIndex(values);
        if(minIndex>maxIndex)
            System.out.println("Границы сумм значений: " + "(" + maxIndex + ";" + minIndex + ")");
            else System.out.println("Границы сумм значений: " + "(" + minIndex + ";" + maxIndex + ")");
        System.out.print("Сумма значений в диапазоне: ");
        amountRange(minIndex, maxIndex, values);
    }

    static void amountRange(int minIndex, int maxIndex, int[] values) {
        int sum = 0;
        if (minIndex>maxIndex) {
            minIndex += maxIndex;
            maxIndex -= minIndex;
            maxIndex = -maxIndex;
            minIndex -= maxIndex;
        }
        for(int i = minIndex+1; i<maxIndex; i++){
            if(i<maxIndex-1)
                System.out.print(values[i] + " + ");
            else if(i == minIndex+1 & i == maxIndex-1)
                    System.out.print("");
            else System.out.print(values[i] + " = ");
            sum += values[i];
        }
        System.out.print(sum);
    }

    static int maxIndex(int[] values) {
        int max = values[0];
        int maxIndex = 0;
        for (int i = 1; i < values.length; i++) {
            if (max < values[i]) {
                max = values[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static int minIndex(int[] values) {
        int min = values[0];
        int minIndex = 0;
        for (int i = 1; i < values.length; i++) {
            if (min > values[i]) {
                min = values[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
