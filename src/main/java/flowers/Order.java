package flowers;

import delivery.Delivery;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import payment.Payment;

import java.util.ArrayList;

@ToString
public class Order {
    private ArrayList<FlowerBucket> items;
    @Setter
    @Getter
    private Payment payment;
    @Setter
    @Getter
    private Delivery delivery;

    public Order() {
        items = new ArrayList<FlowerBucket>();
    }

    public Order(Order order) {
    }


    public boolean process() {
        boolean status = payment.process(getPrice());
        status = delivery.process();
        return status;
    }

    public double getPrice() {
        double price = 0;
        for (FlowerBucket bucket : items) {
            price = bucket.getPrice() + price;
        }
        return price;
    }

    public void addFlowerBucket(FlowerBucket fb) {
        items.add(fb);
    }

}
