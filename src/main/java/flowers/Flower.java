package flowers;

import flowerFeatures.Color;
import flowerFeatures.Country;
import flowerFeatures.Odor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class Flower {
    private Color color;
    private double lenOfStem;
    private double price;
    private Country countryOfOrigin;
    private Odor odor;
    private FlowerSpec flowerSpec;

    public Flower(Color color, double lenOfStem, double price, Country countryOfOrigin,
                  Odor odor, FlowerSpec flowerSpec) {
        this.color = color;
        this.lenOfStem = lenOfStem;
        this.price = price;
        this.flowerSpec = flowerSpec;
        this.countryOfOrigin = countryOfOrigin;
        this.odor = odor;
    }

    public Flower() {
    }
}
