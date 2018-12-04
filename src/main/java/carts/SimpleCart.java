package carts;

import flowers.FlowerBouquet;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;

@ToString
@Getter
public class SimpleCart implements Cart {
    private ArrayList<FlowerBouquet> flowerBouquets = new ArrayList<>();

    @Override
    public void addBouquent(FlowerBouquet flowerBouquet) {
        flowerBouquets.add(flowerBouquet);
    }

    @Override
    public ArrayList<FlowerBouquet> getBouquets() {
        return flowerBouquets;
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (FlowerBouquet flowerBouquet : this.flowerBouquets) {
            price += flowerBouquet.getPrice();
        }
        return price;
    }
}
