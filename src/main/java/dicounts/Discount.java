package dicounts;


import flowers.FlowerBucket;
import flowers.Order;

public class Discount extends Order {
    private Order order;

    public Discount(Order order) {
        this.order = order;
    }

    @Override
    public double getPrice() {
        return order.getPrice();
    }

    @Override
    public boolean process() {
        return order.process();
    }

    @Override
    public void addFlowerBucket(FlowerBucket fb){order.addFlowerBucket(fb);}
}
