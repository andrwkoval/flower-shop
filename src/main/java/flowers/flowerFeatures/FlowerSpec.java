package flowers.flowerFeatures;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum FlowerSpec {
    SPIKES("Spikes"), RARITY("Very rare"), POISON("Poisonous");
    private String flowerSpec;

    FlowerSpec(String flowerSpec) {
        this.flowerSpec = flowerSpec;
    }
}
