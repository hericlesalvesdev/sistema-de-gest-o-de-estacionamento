package entities;

public class Car {

    private String licensePlate;
    private String ownerName;
    private String brand;

    public Car(String licensePlate, String ownerName, String brand) {
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        this.brand = brand;
    }

    public String getLicensePlate() {

        return licensePlate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getBrand() {
        return brand;
    }
}
