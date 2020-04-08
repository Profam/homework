package by.rabtsevich.task34;

public class Main {

    public static void main(String[] args) {
        String[] products = {"греча", "огурцы", "сметана", "борщ"};
        Cashier[] cashier = {new Cashier("в кассе 1"),
                new Cashier("в кассе 2"),
                new Cashier("в кассе 3")};
        for (int i = 0; i < 5; i++)

            new Customer("Покупатель № " + i, cashier, products);
    }
}
