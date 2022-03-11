package controllers;

import java.util.Scanner;

public class DataInput {
    public DataInput() {
    }

    public double getAmountOfRoastedCoffee() {
        Scanner inputAmount = new Scanner(System.in);
        double amountRoastedCoffee;
        amountRoastedCoffee = inputAmount.nextDouble();
        return amountRoastedCoffee;
    }

    public int getNumberOfCoffeeShot() {
        Scanner inputCoffeeShot = new Scanner(System.in);
        int amountCoffeeShot;
        amountCoffeeShot = inputCoffeeShot.nextInt();
        return amountCoffeeShot;
    }
}
