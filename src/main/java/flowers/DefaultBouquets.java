package flowers;

import flowers.flowerFeatures.*;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@ToString
public class DefaultBouquets {
    private static DefaultBouquets instance = new DefaultBouquets();
    private ArrayList<FlowerBouquet> defaultBouquets;

    private DefaultBouquets() {
        Flower rose = new Flower(FlowerType.ROSE, Color.RED, 30, 50, Country.ITALY, Odor.NICE,
                new ArrayList<FlowerSpec>());
        Flower tulip = new Flower(FlowerType.TULIP, Color.BLACK, 25, 35, Country.USA, Odor.AWESOME,
                new ArrayList<FlowerSpec>());
        Flower chamomile = new Flower(FlowerType.ROSE, Color.WHITE, 15, 15, Country.UKRAINE, Odor.GOOD,
                new ArrayList<FlowerSpec>());

        FlowerBunch roseBunch1 = new FlowerBunch(rose, 20);
        FlowerBunch tulipBunch1 = new FlowerBunch(tulip, 20);
        FlowerBunch chamomileBunch1 = new FlowerBunch(chamomile, 21);
        FlowerBouquet flowerBouquet1 = new FlowerBouquet();
        flowerBouquet1.addFlowers(roseBunch1);
        flowerBouquet1.addFlowers(tulipBunch1);
        flowerBouquet1.addFlowers(chamomileBunch1);

        FlowerBunch roseBunch2 = new FlowerBunch(rose, 5);
        FlowerBunch tulipBunch2 = new FlowerBunch(tulip, 100);
        FlowerBunch chamomileBunch2 = new FlowerBunch(chamomile, 28);
        FlowerBouquet flowerBouquet2 = new FlowerBouquet();
        flowerBouquet2.addFlowers(roseBunch2);
        flowerBouquet2.addFlowers(tulipBunch2);
        flowerBouquet2.addFlowers(chamomileBunch2);

        this.defaultBouquets = new ArrayList<>();
        defaultBouquets.add(flowerBouquet1);
        defaultBouquets.add(flowerBouquet2);

    }

    public static DefaultBouquets getInstance() {
        return instance;
    }

}
