package main.company;

import main.cars.Car;

import java.util.ArrayList;
import java.util.List;

public class Taxicompany {
        private List<Car> carsList = new ArrayList<>();

        public List<Car> getCarsList() {
            return carsList;
        }

        public void setCarsList(List<Car> carsList) {
            this.carsList = carsList;
        }

        @Override
        public String toString() {
            return "\nTaxi Company:" + carsList;
        }
}
