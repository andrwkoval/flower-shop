import carts.Cart;
import flowers.Flower;
import flowers.FlowerBouquet;
import flowers.flowerFeatures.*;
import payment.CashPayment;
import payment.Payment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<FlowerSpec> rose_features = new ArrayList<>();
        ArrayList<FlowerSpec> tulip_features = new ArrayList<>();
        rose_features.add(FlowerSpec.SPIKES);
        tulip_features.add(FlowerSpec.RARITY);

        Flower rose1 = new Flower(FlowerType.ROSE, Color.RED, 35, 30, Country.UKRAINE, Odor.AWESOME,
                rose_features);
        Flower cham1 = new Flower(FlowerType.CHAMOMILE, Color.WHITE, 15, 10, Country.USA, Odor.GOOD,
                new ArrayList<FlowerSpec>());
        Flower tulip1 = new Flower(FlowerType.TULIP, Color.BLACK, 25, 20, Country.ITALY, Odor.NICE,
                tulip_features);
        Flower rose2 = new Flower(FlowerType.ROSE, Color.RED, 30, 45, Country.UKRAINE, Odor.AWESOME,
                rose_features);
        Flower cham2 = new Flower(FlowerType.CHAMOMILE, Color.WHITE, 10, 15, Country.USA, Odor.GOOD,
                new ArrayList<FlowerSpec>());
        Flower tulip2 = new Flower(FlowerType.TULIP, Color.BLACK, 30, 40, Country.ITALY, Odor.NICE,
                tulip_features);

        ArrayList<Flower> flowersInShop = new ArrayList<>(Arrays.asList(rose1, cham1, tulip1, rose2, cham2, tulip2));
        FlowerStore flowerStore = new FlowerStore(flowersInShop);
        flowerStore.assortment();

        HashMap<Integer, Integer> createBouquets = new HashMap<>();
        for (int i = 0; i < 6; i++) {
            createBouquets.put(i, (i + 1) * 3);
        }

        FlowerBouquet customBouquet = flowerStore.formBouquetFromFlowers(createBouquets);
        Cart currentCart = flowerStore.formNewCart(true);
        currentCart.addBouquent(customBouquet);
        System.out.println("Current cart: " + currentCart.getBouquets());
        Payment payment = new CashPayment();
        double yourCash = 70;
        ArrayList<FlowerBouquet> yourBouquets = flowerStore.buyCart(currentCart, payment, yourCash);
        System.out.println("Your flowers: \n" + yourBouquets);
    }
}