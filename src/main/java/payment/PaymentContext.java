package payment;

import lombok.Getter;
import carts.Cart;

@Getter
public class PaymentContext {
    private Payment payment;

    public PaymentContext(Payment payment) {
        this.payment = payment;
    }

    public boolean performPayment(Cart cart, double money) {
        return payment.performPayment(cart, money);
    }
}