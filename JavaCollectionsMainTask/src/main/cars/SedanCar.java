package main.cars;

import main.enums.Color;
import main.enums.SedanBrand;

public class SedanCar extends Car {
    private SedanBrand brand;

    public SedanCar(Color color, double fuelConsumption, int price, int maxSpeed, SedanBrand brand){
        super(color, fuelConsumption, price, maxSpeed);
        this.brand = brand;
    }

    public SedanBrand getBrand() {
        return brand;
    }

    public void setBrand(SedanBrand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "\nSedan{" +
                "brand=" + this.getBrand() +
                ", color=" + this.getColor() +
                ", fuelConsumption(l/100km)=" + String.format("%.1f", this.getFuelConsumption()) +
                ", price($)=" + this.getPrice() +
                ", maxSpeed(km/h)=" + this.getMaxSpeed() +
                '}';
    }
}
