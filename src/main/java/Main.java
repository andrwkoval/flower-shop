import carts.Cart;
import flowers.Flower;
import flowers.FlowerBouquet;
import flowers.FlowerBunch;
import flowers.flowerFeatures.*;
import flowershop.FlowerStore;
import payment.CashPayment;
import payment.Payment;

import java.util.ArrayList;
import java.util.Arrays;

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

        FlowerBunch flowerBunchRose1 = new FlowerBunch(rose1, 10);
        FlowerBunch flowerBunchRose2 = new FlowerBunch(rose2, 12);
        FlowerBunch flowerBunchTulip1 = new FlowerBunch(tulip1, 14);
        FlowerBunch flowerBunchTulip2 = new FlowerBunch(tulip2, 16);
        FlowerBunch flowerBunchCham1 = new FlowerBunch(cham1, 18);
        FlowerBunch flowerBunchCham2 = new FlowerBunch(cham2, 20);

        ArrayList<FlowerBunch> createBouquet = new ArrayList<>();
        createBouquet.add(flowerBunchRose1);
        createBouquet.add(flowerBunchRose2);
        createBouquet.add(flowerBunchTulip1);
        createBouquet.add(flowerBunchTulip2);
        createBouquet.add(flowerBunchCham1);
        createBouquet.add(flowerBunchCham2);
        FlowerBouquet customBouquet = flowerStore.formBouquetFromFlowerBunch(createBouquet);

        Cart currentCart = flowerStore.formNewCart(true);
        currentCart.addBouquent(customBouquet);
        System.out.println("Current cart: " + currentCart.getBouquets());
        Payment payment = new CashPayment();
        double yourCash = 70;
        ArrayList<FlowerBouquet> yourBouquets = flowerStore.buyCart(currentCart, payment, yourCash);
        System.out.println("Your flowers: \n" + yourBouquets);
    }
}