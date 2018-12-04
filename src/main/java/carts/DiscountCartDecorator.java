package carts;

public abstract class DiscountCartDecorator implements Cart {
    protected Cart cart;
    protected double discount;

    public DiscountCartDecorator(Cart cart, double discount) {
        this.cart = cart;
        this.discount = discount;
    }
}
