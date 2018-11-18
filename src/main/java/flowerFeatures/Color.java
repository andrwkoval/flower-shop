package flowerFeatures;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public enum Color {
    WHITE("#FFF"),
    RED("#F00"),
    BLACK("#000000");

    private String rgb;

    Color(String rgb) {
        this.rgb = rgb;
    }
}
