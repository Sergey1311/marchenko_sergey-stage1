package main;

import main.company.Taxicompany;
import main.logic.Actions;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Actions actions = new Actions();
        Taxicompany taxicompany = new Taxicompany();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cars up to 100:");
        int countCar = sc.nextInt();

        if (countCar < 1 || countCar > 100) {
            System.out.println("Invalid number");
        } else {
            actions.createTaxicompany(taxicompany, countCar);
            System.out.println(taxicompany);
        }

        System.out.println("\nTotal cost: " + actions.calculateTotalCost(taxicompany.getCarsList()) + "$");

        Actions.sortCarsByFuelConsumption(taxicompany.getCarsList());
        System.out.println("\nSorted by fuel consumption: " + taxicompany.getCarsList());

        System.out.println("\nEnter min speed range");
        int minSpeedRange = sc.nextInt();
        System.out.println("Enter max speed range");
        int maxSpeedRange = sc.nextInt();
        System.out.println(Actions.findCarBySpeedRange(minSpeedRange, maxSpeedRange, taxicompany.getCarsList())); ;
    }
}
