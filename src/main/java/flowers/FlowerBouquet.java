package flowers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString
public class FlowerBouquet {
    private double price;
    private ArrayList<FlowerBunch> flowerBunches;

    public FlowerBouquet() {
        this.flowerBunches = new ArrayList<>();
    }

    public void addFlowers(FlowerBunch flowerBunch) {
        for (int i = 0; i < flowerBunch.getAmountOfFlowers(); i++) {
            price += flowerBunch.getPrice();
            flowerBunches.add(flowerBunch);
        }
    }

    public double getPrice() {
        return price;
    }
}
