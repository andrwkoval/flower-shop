package payment;

import carts.Cart;

public interface Payment {
    boolean performPayment(Cart cart, double yourMoney);
}
