package hello.model;

/**
 * Класс описывает ордер на покупку или продажу ценной бумаги
 * Created by fesswood on 18.06.16.
 */
public class Order {

    private double price;
    private int count;


    public Order() {
    }

    public Order(float v, int i) {
        price =v;
        count = i;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderModel{" +
                "price=" + price +
                ", count=" + count +
                '}';
    }
}
