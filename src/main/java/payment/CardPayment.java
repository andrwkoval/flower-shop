package payment;

import carts.Cart;

public class CardPayment implements Payment {

    @Override
    public boolean performPayment(Cart cart, double cardBalance) {
        if (cardBalance < cart.getPrice()) {
            System.out.println("Not enough money to make the payment");
            return false;
        } else {
            System.out.println("Payment successful!!");
            return true;
        }
    }
}
