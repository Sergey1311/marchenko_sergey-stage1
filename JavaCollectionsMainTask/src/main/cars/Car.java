package main.cars;

import main.enums.Color;

public class Car {
    private Color color;
    private double fuelConsumption;
    private int price;
    private int maxSpeed;

    public Car(Color color, double fuelConsumption, int price, int maxSpeed) {
        this.color = color;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", fuelConsumption(l/100km)=" + String.format("%.1f", this.getFuelConsumption()) +
                ", price($)=" + this.getPrice() + this.getMaxSpeed() +
                '}';
    }
}
