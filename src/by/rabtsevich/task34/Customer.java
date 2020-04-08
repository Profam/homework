package by.rabtsevich.task34;

public class Customer extends Thread {
    String products[];
    private Cashier[] cashiers;

    public Customer(String name, Cashier[] cashiers, String[] products) {
        super(name);

        this.products = products;

        this.cashiers = cashiers;

        this.start();
    }


    public String[] getProducts() {
        return this.products;
    }

    @Override
    public void run() {
        boolean ind = true;
        while (ind) {
            for (int i = 0; i < this.cashiers.length; i++) {
                System.out.println(this.cashiers[i].getProducts(this));
                if (this.isAlive()) {
                    ind = false;
                    break;
                }
            }
        }
    }
}
