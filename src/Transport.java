public abstract class Transport {
    String speed;
    String color;
    String region;
    boolean isFullEquipment;
    double price;
    int numberOfSeats;
    double volumeOfEngine;
    double weight;
    boolean isNew;

    public Transport(String speed, String color, String region, boolean isFullEquipment, double price, int numberOfSeats, double volumeOfEngine, double weight) {
        this.speed = speed;
        this.color = color;
        this.region = region;
        this.isFullEquipment = isFullEquipment;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
        this.volumeOfEngine = volumeOfEngine;
        this.weight = weight;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public boolean isFullEquipment() {
        return isFullEquipment;
    }

    public void setFullEquipment(boolean fullEquipment) {
        isFullEquipment = fullEquipment;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public double getVolumeOfEngine() {
        return volumeOfEngine;
    }

    public void setVolumeOfEngine(double volumeOfEngine) {
        this.volumeOfEngine = volumeOfEngine;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        this.isNew = aNew;
    }
}
