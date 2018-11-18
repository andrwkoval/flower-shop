package flowerFeatures;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum Odor {

    AWESOME("smells awesome"),
    NICE("smells nice"),
    GOOD("smells good"),
    BAD("smells bad"),
    AWFUL("smells awful"),
    TERRIBLE("smells terrible");

    private String odor;

    Odor(String odor) {
        this.odor = odor;
    }
}
