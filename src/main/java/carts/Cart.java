package carts;

import flowers.FlowerBouquet;

import java.util.ArrayList;

public interface Cart {

    void addBouquent(FlowerBouquet flowerBouquet);
    ArrayList<FlowerBouquet> getBouquets();
    double getPrice();

}
