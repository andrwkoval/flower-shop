package carts;

import flowers.FlowerBouquet;

import java.util.ArrayList;

public class DiscountCart extends DiscountCartDecorator {
    public DiscountCart(Cart cart, double discount) {
        super(cart, discount);
    }

    @Override
    public void addBouquent(FlowerBouquet flowerBouquet) {
        cart.addBouquent(flowerBouquet);
    }

    @Override
    public ArrayList<FlowerBouquet> getBouquets() {
        return cart.getBouquets();
    }

    @Override
    public double getPrice() {
        return cart.getPrice() - cart.getPrice() * discount;
    }
}
