package flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class FlowerBunch {

    private Flower flowerType;
    private int amountOfFlowers;

    double getPrice() {
        return this.amountOfFlowers * this.flowerType.getPrice();
    }

}
