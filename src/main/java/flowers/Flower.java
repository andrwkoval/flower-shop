package flowers;

import flowers.flowerFeatures.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Data
@Setter
@Getter
@AllArgsConstructor
public class Flower {
    private FlowerType flowerType;
    private Color color;
    private double lenOfStem;
    private double price;
    private Country countryOfOrigin;
    private Odor odor;
    private ArrayList<FlowerSpec> flowerSpec;
}
