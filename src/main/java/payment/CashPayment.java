package payment;

import carts.Cart;

public class CashPayment implements Payment {

    @Override
    public boolean performPayment(Cart cart, double cash) {
        return cash > cart.getPrice();
    }
}
