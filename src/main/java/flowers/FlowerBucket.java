package flowers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString
public class FlowerBucket {
    private double price;
    private ArrayList<Flower> flowerGroups;

    public FlowerBucket() {
        this.flowerGroups = new ArrayList<>();
    }

    public void addFlower(Flower flower, int amount) {
        for (int i = 0; i < amount; i++) {
            price += flower.getPrice();
            flowerGroups.add(flower);
        }
    }

    public double getPrice() {
        return price;
    }
}
