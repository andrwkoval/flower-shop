package flowers.flowerFeatures;

public enum FlowerType {
    CHAMOMILE("Chamomile"), TULIP("Tulip"), ROSE("Rose");
    private String typeOfFlower;

    FlowerType(String flowerType) {
        this.typeOfFlower = flowerType;
    }
}
