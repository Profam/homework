package by.rabtsevich.task34;

public class Cashier {
    private String cashierNm;

    public Cashier(String cashierNm) {
        this.cashierNm = cashierNm;
    }

    public String getcashierNm() {
        return this.cashierNm;
    }

    public synchronized String getProducts(Customer customer) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < customer.getProducts().length; i++)
            if (i != customer.getProducts().length - 1)

                result.append(customer.getProducts()[i] + ", ");
            else
                result.append(customer.getProducts()[i]);

        return customer.getName() + " купил " + result + " в " + this.getcashierNm();
    }
}
