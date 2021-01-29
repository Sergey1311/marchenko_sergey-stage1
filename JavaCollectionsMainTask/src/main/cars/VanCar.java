package main.cars;

import main.enums.Color;
import main.enums.VanBrand;

public class VanCar extends Car {
    private VanBrand brand;
    private int passengersCapacity;

    public VanCar(Color color, double fuelConsumption, int price, int maxSpeed, VanBrand brand, int passengersCapacity){
        super(color, fuelConsumption, price, maxSpeed);
        this.brand = brand;
        this.passengersCapacity = passengersCapacity;
    }

    public VanBrand getBrand() {
        return brand;
    }

    public void setBrand(VanBrand brand) {
        this.brand = brand;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public void setPassengersCapacity(int passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }

    @Override
    public String toString() {
        return "\nVan{" +
                "brand=" + this.getBrand() +
                ", color=" + this.getColor() +
                ", fuelConsumption(l/100km)=" + String.format("%.1f", this.getFuelConsumption()) +
                ", price($)=" + this.getPrice() +
                ", maxSpeed(km/h)=" + this.getMaxSpeed() +
                ", passengersCapacity=" + this.getPassengersCapacity() +
                '}';
    }
}
