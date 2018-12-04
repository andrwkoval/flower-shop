package flowers.flowerFeatures;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum Country {
    UKRAINE("Ukraine"),
    USA("United States of America"),
    ITALY("Italy");

    private String countryOfOrigin;

    Country(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
}
