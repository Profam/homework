package by.Rabtsevich.task12;

/*
Задание 12.
Имеется целое число, следует вывести его в бухгалтеском формате.
Т.е. начиная справа каждые три позиции отделяются пробелом.
Например число 20023143 дожно быть выведено как 20 023 143
 */

import java.util.Scanner;

public class NumberFormat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        long x = in.nextLong();
        changeToAccountingFormat(x);  //System.out.printf("%,d", x);
    }

   static void changeToAccountingFormat(long x) {
       if((x >= 0 & x < 1000) | (x < 0 & x > -1000)) System.out.println(x);
       else {
           String s = Long.toString(x % 10);
           x /= 10;
           int j = 1;
           for (long i = x; i / 10 != 0; i = x) {
               s += x % 10;
               x /= 10;
               if (j == 2) {
                   s += " ";
                   j = 0;
               } else j++;
           }
           if(x>0) s += x;
           else {
               x /= -1;
               System.out.print("-");
               s += x;
           }
           for (int i = s.length() - 1; i >= 0; i--) {
               System.out.print(s.charAt(i));
           }
       }
   }
}

