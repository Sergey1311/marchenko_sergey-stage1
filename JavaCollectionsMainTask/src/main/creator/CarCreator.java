package main.creator;

import main.cars.Car;
import main.cars.SedanCar;
import main.cars.VanCar;
import main.cars.WagonCar;
import main.enums.Color;
import main.enums.SedanBrand;
import main.enums.VanBrand;
import main.enums.WagonBrand;

import java.util.Random;

public class CarCreator {
    public static Car createCar() {
        Random random = new Random();
        switch (random.nextInt(3)) {
            case 0:
                return new SedanCar(
                        Color.values()[(new Random().nextInt(Color.values().length))],
                        random.nextDouble() * 15 + 5,
                        random.nextInt(50) * 100 + 8000, random.nextInt(14) * 5 + 160,
                        SedanBrand.values()[(new Random().nextInt(SedanBrand.values().length))]
                );

            case 1:
                return new VanCar(
                        Color.values()[(new Random().nextInt(Color.values().length))],
                        random.nextDouble() * 15 + 5,
                        random.nextInt(50) * 100 + 8000, random.nextInt(14) * 5 + 160,
                        VanBrand.values()[(new Random().nextInt(VanBrand.values().length))],
                        random.nextInt(3) + 6
                );

            case 2:
                return new WagonCar(
                        Color.values()[(new Random().nextInt(Color.values().length))],
                        random.nextDouble() * 15 + 5,
                        random.nextInt(50) * 100 + 8000, random.nextInt(14) * 5 + 160,
                        WagonBrand.values()[(new Random().nextInt(WagonBrand.values().length))],
                        random.nextInt(10) * 100 + 1000
                );

            default:
                throw new IllegalArgumentException();
        }
    }
}
