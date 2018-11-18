package dicounts;

import flowers.Order;

public class PromocodeDiscount extends Discount {
    private Order order;

    public PromocodeDiscount(Order order) {
        super(order);
        this.order = order; }

    public double getPrice() {
        return 0.8 * order.getPrice();
    }

}
