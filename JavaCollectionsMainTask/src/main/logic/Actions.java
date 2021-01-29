package main.logic;

import main.cars.Car;
import main.company.Taxicompany;
import main.creator.CarCreator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Actions {
    public void createTaxicompany(Taxicompany taxicompany, int countCar) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < countCar; i++) {
            cars.add(CarCreator.createCar());
        }
        taxicompany.setCarsList(cars);
    }

    public int calculateTotalCost(List<Car> cars) {
        int totalCost = 0;
        for (Car car : cars) {
            totalCost += car.getPrice();
        }
        return totalCost;
    }

    public static void sortCarsByFuelConsumption (List<Car> cars) {
        cars.sort(Comparator.comparingDouble(Car::getFuelConsumption));
    }

    public static Car findCarBySpeedRange(int min, int max, List<Car> cars) {
        Car foundCar = null;
        for (Car car : cars) {
            if (car.getMaxSpeed() >= min && car.getMaxSpeed() <= max) {
                foundCar = car;
                break;
            }
        }
        return foundCar;
    }
}
