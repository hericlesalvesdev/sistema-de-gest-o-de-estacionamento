package entities;

import java.util.ArrayList;

public class ParkingLot {

    private int totalSpaces;
    private int availableSpaces;
    private ArrayList<Car> parkedCars;

    public ParkingLot(int totalSpaces) {

        this.totalSpaces = totalSpaces;
        this.availableSpaces = totalSpaces;
        this.parkedCars = new ArrayList<>();

    }

    public boolean addCar(Car car) {

        if (availableSpaces > 0) {
            parkedCars.add(car);
            availableSpaces--;
            return true;
        }
        return false;
    }

    public boolean removeCar(String licensePlate) {
        for (Car car : parkedCars) {
            if (car.getLicensePlate().equals(licensePlate)) {
                parkedCars.remove(car);
                availableSpaces++;
                return true;
            }
        }
        return false;
    }

    public int getTotalSpaces() {
        return totalSpaces;
    }

    public int getAvailableSpaces() {
        return availableSpaces;

    }

    public void listParkedCars() {
        if (parkedCars.isEmpty()) {
            System.out.println("There is no parked car");
        } else {

            for (Car car : parkedCars) {
                System.out.println("License plate: " + car.getLicensePlate());
                System.out.println("Owner name: " + car.getOwnerName());
                System.out.println("Brand: " + car.getBrand());
            }
        }
    }
}
