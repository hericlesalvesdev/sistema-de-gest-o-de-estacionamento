package application;

import entities.Car;
import entities.ParkingLot;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParkingLot lot = new ParkingLot(100);

        while (true) {
            System.out.println();
            System.out.println("Enter an option: ");
            System.out.println("1- Add Car");
            System.out.println("2- Remove Car");
            System.out.println("3- Search Car");
            System.out.println("4- Check available spaces");
            System.out.println("5- Exit");
            System.out.println();

            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter license plate: ");
                    String licensePlate = sc.next();

                    System.out.println("Enter owner name: ");
                    String owner = sc.next();

                    System.out.println("Enter car brand: ");
                    String brand = sc.next();

                    Car car = new Car(licensePlate, owner, brand);

                    if (lot.addCar(car)) {
                        System.out.println("Car added successfully");
                    } else {
                        System.out.println("No available spaces");
                    }
                    break;

                case 2:
                    System.out.println("Enter license plate to remove: ");
                    String placeToRemove = sc.next();

                    if (lot.removeCar(placeToRemove)) {
                        System.out.println("Car removed successfully");
                    } else {
                        System.out.println("Car not found");
                    }
                    break;

                case 3:
                    lot.listParkedCars();
                    break;

                case 4:
                    System.out.println("Total of remaining vacancies:  " + lot.getAvailableSpaces());
                    break;

                    case 5:
                        System.out.println("Exiting...");
                        sc.close();
                        System.exit(0);
                        break;

                        default:
                            System.out.println("Invalid option");
                            break;
            }

        }

    }
}