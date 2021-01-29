package main.cars;

import main.enums.Color;
import main.enums.WagonBrand;

public class WagonCar extends Car {
    private WagonBrand brand;
    private int loadCapacity;

    public WagonBrand getBrand() {
        return brand;
    }

    public void setBrand(WagonBrand brand) {
        this.brand = brand;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public WagonCar(Color color, double fuelConsumption, int price, int maxSpeed, WagonBrand brand, int loadCapacity){
        super(color, fuelConsumption, price, maxSpeed);
        this.brand = brand;
        this.loadCapacity = loadCapacity;


    }

    @Override
    public String toString() {
        return "\nWagon{" +
                "brand=" + this.getBrand() +
                ", color=" + this.getColor() +
                ", fuelConsumption(l/100km)=" + String.format("%.1f", this.getFuelConsumption()) +
                ", price($)=" + this.getPrice() +
                ", maxSpeed(km/h)=" + this.getMaxSpeed() +
                ", loadCapacity(kg)=" + this.getLoadCapacity() +
                '}';
    }
}
